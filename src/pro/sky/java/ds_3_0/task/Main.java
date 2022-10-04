package pro.sky.java.ds_3_0.task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Методы");
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1 *************************************************************");
        checkLeapYear(2024);
    }

    public static void checkLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    public static void task2() {
        System.out.println("\nЗадание 2 *************************************************************");
        suggestOsVersion(0, 2021);
    }

    public static void suggestOsVersion(int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year > currentYear) {
            throw new IllegalArgumentException("Wrong Year");
        }
        if (os == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Ошибка - устройство не распознано");
        }
    }

    public static void task3() {
        System.out.println("\nЗадание 3 *************************************************************");
        int deliveryPeriod = calculateDeliveryPeriod (95);
            System.out.println("Потребуется дней: " + deliveryPeriod);
    }

    public static int calculateDeliveryPeriod(int distance) {
        int period = (int) Math.round((double) distance / 40) + 1;
        if (distance <= 20) {
            return 1;
        } else {
            return period;
        }
    }
}
