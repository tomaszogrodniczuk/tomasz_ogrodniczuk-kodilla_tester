package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Raport sprzedazy", LocalDate.of(2020,1,15), LocalDate.of(2020,5, 6)));
        tasks.add(new Task("Plan marketingowy", LocalDate.of(2020,1,25), LocalDate.of(2020,5, 10)));
        tasks.add(new Task("Zestawienie przychodow", LocalDate.of(2019,12,11), LocalDate.of(2020,6, 15)));
        tasks.add(new Task("Wdrozenie systemu", LocalDate.of(2020,2,1), LocalDate.of(2020,3, 19)));
        tasks.add(new Task("Rekrutacja asystenta", LocalDate.of(2019,11,3), LocalDate.of(2020,4, 17)));
        tasks.add(new Task("Zakup samochodu", LocalDate.of(2020,4,1), LocalDate.of(2020,7, 31)));
        return tasks;
    }
}
