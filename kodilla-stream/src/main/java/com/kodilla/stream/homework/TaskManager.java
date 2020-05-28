package com.kodilla.stream.homework;

import java.time.LocalDate;

public class TaskManager {
    public static void main(String[] args) {
        TaskRepository.getTasks()
                .stream()
                .filter(t -> LocalDate.now().isBefore(t.getDeadline()))
                .map(t -> t.getName())
                .forEach(tk -> System.out.println(tk));
    }
}
