package com.jk.service;

import com.jk.mapper.UserMapper;
import com.jk.model.RolePage;
import com.jk.model.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

 @Autowired
 private UserMapper userMapper;

 @Override
 public RolePage getUserPage(UserBean userBean) {
  userBean.calculate();
  RolePage roles = new RolePage();
  int count =userMapper.getUserCount(userBean);
  roles.setTotal(count);
  List<UserBean> users =userMapper.getUserPage(userBean);
  roles.setRows(users);
  return roles;
 }

 @Override
 public void addUser(UserBean userBean) {
  userMapper.addUser(userBean);
 }

 @Override
 public UserBean getUserInfoById(UserBean userBean) {
  return userMapper.getUserInfoById(userBean);
 }

 @Override
 public void updateUser(UserBean userBean) {
  userMapper.updateUser(userBean);
 }

 @Override
 public void deleteUser(UserBean userBean) {
  userMapper.deleteUser(userBean);
 }

}

