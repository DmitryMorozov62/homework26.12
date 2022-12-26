public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //пишем код для задачи 1
        int clientOS = 1;
        if (clientOS >= 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else
            System.out.println("Установите версию приложения для Android по ссыдке");

    }
    public static void task2() {
        System.out.println("Задача 2");
        //пишем код для задачи 2
        int clientDeviceYear = 2013;
        int clientOS = 0;
        boolean iOS = clientOS >= 1 && clientDeviceYear >= 2015;
        boolean iOSLite = clientOS >= 1 && clientDeviceYear < 2015;
        boolean android = clientOS < 1 && clientDeviceYear >= 2015;
        boolean androidLite = clientOS < 1 && clientDeviceYear < 2015;
            if (iOS) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            if (android) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

            if (iOSLite) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            }
            if (androidLite) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            }



    }
    public static void task3 () {
        System.out.println("Задача 3");
        //пишем код для задачи 3
        int year = 2021;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("год " + year + " является високосным");

        } else {
            System.out.println("год " + year + " не является високосным");
        }
    }

}