package com.chdtu.hw3.task3;
import java.util.Scanner;
public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();

        isHigh = bodyTemperature > 37;
        isLow = bodyTemperature < 36;

        if (isHigh) {
            System.out.println("температура тіла висока");
        } else if (isLow) {
            System.out.println("температура тіла низька");
        } else {
            System.out.println("температура тіла нормальна");
        }
    }
}

