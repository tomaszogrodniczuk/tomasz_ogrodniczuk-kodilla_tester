package com.kodilla.optional.homework;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Janek", new Teacher("prof. Kowalski")));
        students.add(new Student("Janek", new Teacher("prof. Nowak")));
        students.add(new Student("Janek", null));
        students.add(new Student("Janek", new Teacher("prof. Jagielski")));
        students.add(new Student("Janek", null));
        students.add(new Student("Janek", new Teacher("prof. Adamczyk")));

        for (Student student : students)
            System.out.println("Uczeń: " + student.getName() + ", nauczyciel: " + student.getTeacher().getName());
    }
}
