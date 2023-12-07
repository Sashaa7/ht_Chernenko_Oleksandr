package com.chdtu.hw14.task2;

import java.util.HashMap;

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентів групи: ");
        printStudents();
        System.out.print("Середній бал групи: " + getAverageMark());
    }

    public static void addStudents() {
        grades.put("Давидов Олег", 4.3d);
        grades.put("Шульга Микола", 4.1d);
        grades.put("Колос Василь", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        for (String student : grades.keySet()) {
            System.out.println(student);
        }
    }

    public static Double getAverageMark() {
        if (grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0;
        for (Double mark : grades.values()) {
            sum += mark;
        }

        return sum / grades.size();
    }
}
