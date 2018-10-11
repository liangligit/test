package com.jk.mapper;

import com.jk.model.UserBean;

import java.util.List;

public interface UserMapper {

 int getUserCount(UserBean userBean);

 List<UserBean> getUserPage(UserBean userBean);

 void addUser(UserBean userBean);

 UserBean getUserInfoById(UserBean userBean);

 void updateUser(UserBean userBean);

 void deleteUser(UserBean userBean);
}
