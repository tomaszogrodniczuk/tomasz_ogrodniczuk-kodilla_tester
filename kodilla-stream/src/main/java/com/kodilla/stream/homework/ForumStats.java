package com.kodilla.stream.homework;

import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double avgAboveOrEqual40 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() >=40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts of users above or equal 40 years old: " + avgAboveOrEqual40);

        double avgUnder40 = UsersRepository.getUsersList()
                .stream()
                .filter(age -> age.getAge() <40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println("Average number of posts of users under 40 years old: " + avgUnder40);
    }
}
