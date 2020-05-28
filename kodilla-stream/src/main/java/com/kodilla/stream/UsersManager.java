package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {
        //UsersRepository.getUsersList()
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                //.map(u -> u.getUserName())
                .map(UsersManager::getUserName)
               // .forEach(un -> System.out.println(un));
                .collect(Collectors.toList());
        System.out.println(usernames);
    }

    public static String getUserName(User user){
        return user.getUserName();
    }
}
