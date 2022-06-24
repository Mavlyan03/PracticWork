package com.company.service;

import com.company.MyException;
import com.company.model.Gender;
import com.company.model.User;

import java.util.List;


public interface UserService  {

   void addUser(List<User> user);

   void findByID(List<User> user);

   void removeByID(List<User> user);

   void takeUsersWithID(List<User> user);


}
