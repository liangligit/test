package com.jk.controller;

import com.jk.model.RolePage;
import com.jk.model.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.UUID;

@Controller
@RequestMapping("user")
public class UserController {

 @Autowired
 private UserService userService;

 @RequestMapping("toMain")
 public String toMain(){
  return "";
 }

 @RequestMapping("toIndex")
 private String toIndex(){
  return "index";
 }

 @RequestMapping("getUserPage")
 @ResponseBody
 private RolePage getUserPage(UserBean userBean){
  RolePage roles=userService.getUserPage(userBean);
  return roles;
 }

 @RequestMapping("toAddUser")
 private String toAddUser(){
  return "addUser";
 }

 @RequestMapping("addUser")
 @ResponseBody
 public Boolean addUser(UserBean userBean){
  try {
   userBean.setId(UUID.randomUUID().toString().replaceAll("-",""));
   userService.addUser(userBean);
  }catch (Exception e){
   e.printStackTrace();
   return false;
  }
  return true;
 }

 @RequestMapping("toeditUser")
 public String toeditUser(ModelMap mm,UserBean userBean){
  UserBean users = userService.getUserInfoById(userBean);
  mm.put("uu",users);
  return "editUser";
 }

 @RequestMapping("updateUser")
 @ResponseBody
 public Boolean updateUser(UserBean userBean){
  try {
   userService.updateUser(userBean);
  }catch (Exception e){
   return false;
  }
  return true;
 }

 @RequestMapping("deleteUser")
 @ResponseBody
 public Boolean deleteUser(UserBean userBean){
  try {
   userService.deleteUser(userBean);
  }catch (Exception e){
   return false;
  }
  return true;
 }

}
