package com.jk.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 *
 */
public class UserBean extends Page implements Serializable {

 private static final long serialVersionUID = 1373671274604743002L;

 private String id;

 private String name;

 @DateTimeFormat(pattern = "yyyy-MM-dd")
 @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
 private Date birthday;

 private Integer sex;

 private String email;

 public String getId() {
  return id;
 }

 public void setId(String id) {
  this.id = id;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Date getBirthday() {
  return birthday;
 }

 public void setBirthday(Date birthday) {
  this.birthday = birthday;
 }

 public Integer getSex() {
  return sex;
 }

 public void setSex(Integer sex) {
  this.sex = sex;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }
}
