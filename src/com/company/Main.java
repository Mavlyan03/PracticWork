package com.company;

import com.company.impl.UserServiceImpl;
import com.company.model.Gender;
import com.company.model.User;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws MyException {
        Scanner scanner = new Scanner(System.in);
        ArrayList<User> user = new ArrayList<>();
        user.add(new User(2, "John White", 24, Gender.MALE));
        user.add(new User(1, "Jessica Moon", 22, Gender.FEMALE));
        user.add(new User(3, "Sam Winchester", 23, Gender.MALE));

        UserServiceImpl userService = new UserServiceImpl();

        int num = scanner.nextInt();
        try {
        switch (num) {
            case 1:
                userService.findByID(user);
                break;
            case 2:
                userService.removeByID(user);
                break;
            case 3:
                userService.takeUsersWithID(user);
                break;
            case 4:
                userService.addUser(user);
                break;
            default:
                throw new MyException();
        }
        } catch (MyException e) {
            e.exception();
        }
    }
}

