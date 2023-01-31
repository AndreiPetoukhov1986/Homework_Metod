public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void toTask1(int y) {
        if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
            System.out.println(y + " год — високосный год");
        } else {
            System.out.println(y + " год — невисокосный год");
        }
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 1960;
        toTask1(year);
    }

    public static void toTask2(int os, int year) {
        if (os!=1 && os!=0) {
            System.out.println("ОС должна быть равна 0 или 1");
            return;
        } else if (os == 1) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (os == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientDeviceYear = 2021;
        int clientOS = 1; // 0 — iOS, 1 — Android
        toTask2(clientOS, clientDeviceYear);
    }
    public static int calculateDeliveryDays (int deliveryDistance) {
        if (deliveryDistance>=0 && deliveryDistance<=20) {
           return 1;
        }
        else if (deliveryDistance>20 && deliveryDistance<=60) {
            return 2;
        }
        else if (deliveryDistance>60 && deliveryDistance<=100) {
            return 3;
        } else {
            return -1;
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 20;
        int days = calculateDeliveryDays(deliveryDistance);
        if (days==-1){
            System.out.println("Доствка невозможна");
        } else {
            System.out.println("Потребуется для доставки дней: " + days);
        }
    }
}