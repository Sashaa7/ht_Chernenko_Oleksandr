package com.chdtu.hw12.task9;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Гунігерд");
        paySalary("Іногрім");
        paySalary(null);
        System.out.println(waitingEmployees);
        System.out.println(alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name) {
        if (name != null && waitingEmployees.contains(name)) {
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
            alreadyGotSalaryEmployees.add(name);
        }
    }
}

