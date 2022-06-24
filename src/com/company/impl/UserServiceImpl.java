package com.company.impl;

import com.company.dao.UserDao;
import com.company.model.Gender;
import com.company.model.User;
import com.company.service.UserService;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class UserServiceImpl implements UserService {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void addUser(List<User> user) {
        System.out.println("Write new user");
    }

    @Override
    public void findByID(List<User> user) {
     user.stream().filter(x -> x.getId() == 1).forEach(System.out::println);

    }
    @Override
    public void removeByID(List<User> user) {
     user.removeIf(u -> u.getId() == 2);
    }

    @Override
    public void takeUsersWithID(List<User> user) {
     user.forEach(System.out::println);
    }

}
