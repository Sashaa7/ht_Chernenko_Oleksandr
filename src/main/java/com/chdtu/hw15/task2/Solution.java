package com.chdtu.hw15.task2;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Купи слона");
        } else if (answer.toLowerCase().equals("ок")) {
            System.out.println("Так-то краще :) Список твоїх відмовок:");
            throw new SecurityException();
        } else {
            System.out.println("Усі кажуть \"" + answer + "\", а ти купи слона");
        }
        answer = scanner.nextLine();
        try {
            buyElephant(answer, scanner);
        } catch (SecurityException e) {
            System.out.println(answer);
            throw e;
        }
    }
}

