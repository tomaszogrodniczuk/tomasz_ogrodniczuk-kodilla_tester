package com.kodilla.stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n -> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
