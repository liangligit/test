package com.jk.service;

import com.jk.model.RolePage;
import com.jk.model.UserBean;

public interface UserService {
 RolePage getUserPage(UserBean userBean);

 void addUser(UserBean userBean);

 UserBean getUserInfoById(UserBean userBean);

 void updateUser(UserBean userBean);

 void deleteUser(UserBean userBean);
}
