package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        while (true) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            while (year == 0) {
                System.out.println("Введите год повторно");
                year = scanner.nextInt();
            }
            System.out.println("Введите количество дней:");
            int days = scanner.nextInt();
            int var1 = checkingDaysOfTheYear(year);
            if (days == 365 && days == var1) {
                score++;
            } else if (days == 366 && days == var1) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + var1 + " дней!");
                System.out.println("Набрано очков: " + score);
                break;
            }
        }
    }

    public static int checkingDaysOfTheYear(int year) {
        if (year % 400 == 0) {
            return 366;
        } else if (year % 100 == 0) {
            return 365;
        } else if (year % 4 == 0) {
            return 366;
        } else {
            return 365;
        }
    }

    public static boolean isValidYear(int year) {
        return year > 0;
    }
}