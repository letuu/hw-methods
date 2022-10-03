package pro.sky.java.ds_3_0.task;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание Методы");
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задание 1 *************************************************************");
        int yearCurrent = 2024;
        checkLeapYear(yearCurrent);
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
        int clientDeviceYear = 2014;
        int clientOS = 0;
        suggestOsVersion(clientOS, clientDeviceYear);
    }

    public static void suggestOsVersion(int os, int year) {
        if (os == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (year < 2015) {
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
        int deliveryDistance = 195; //расстояние до клиента
        int deliveryPeriod = calculateDeliveryPeriod (deliveryDistance);
        if (deliveryDistance <= 100) {
            System.out.println("На доставку в пределах " + deliveryDistance + " км потребуется " + deliveryPeriod + " сут");
        } else {
            System.out.println("На доставку в пределах " + deliveryDistance + " км потребуется более " + deliveryPeriod + " сут (уточняйте у менеджера)");
        }
    }

    public static int calculateDeliveryPeriod(int distance) {
        int period = 1;
        if (distance <= 20) {
            return period;
        } else if (distance <= 60) {
            return period + 1;
        } else if (distance <= 100) {
            return period + 2;
        } else {
            return period + 2;
        }
    }
}
