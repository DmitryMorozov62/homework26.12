import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        //пишем код для задачи 1
        int years = 12;
        System.out.print("Если возраст человека равен " + years + " то,");
        if (years >= 18) {
            System.out.println(" он совершеннолетний");
        } else {
            System.out.println(" он не достиг совершеннолетия, нужно подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        //пишем код для задачи 2
        int temperature = 0;
        System.out.print("На улице " + temperature + " градусов,");
        if (temperature < 5) {
            System.out.println(" нужно надеть шапку");
        } else {
            System.out.println(" можно идти без шапки");
        }

    }

    public static void task3() {
        System.out.println("Задача 3");
        //пишем код для задачи 3
        int speed = 90;
        System.out.print("Если скорость " + speed + " км/ч то,");
        if (speed < 60) {
            System.out.println(" можно ездить спокойно");
        } else {
            System.out.println(" придется заплатить штраф");
        }

    }

    public static void task4() {
        System.out.println("Задача 4");
        //пишем код для задачи 4
        int years = 32;
        System.out.print("Если возраст человека равен " + years + " , то ему нужно ходить");
        boolean job = years >= 24;
        boolean institute = years >= 18 && years < 24;
        boolean school = years < 18 && years >= 7;
        boolean kindergarten = years <=6 && years > 2;
        if (job) {
            System.out.println(" на работу");
        } else if (institute) {
            System.out.println(" в институт");
        } else if (school) {
            System.out.println(" в школу");
        } else if (kindergarten) {
            System.out.println(" в детский сад");
        } else {
            System.out.println(" (^_^) ");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        //пишем код для задачи 5
        int years = 3;
        System.out.print("Если возраст ребенка равен " + years + " то ему");
        if (years >= 14) {
            System.out.println(" можно кататься без споровожления взрослых");
        } else if (years < 14 && years >= 5) {
            System.out.println(" можно кататься на аттракционе в сопровождении");
        } else {
            System.out.println(" нельзя кататься на аттракционе");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        //пишем код для задачи 6
        int number = 100;
        boolean standingPlace = number < 102 && number > 60;
        boolean seatingPlace = number <= 60;
        if (number >= 102) {
            System.out.println("Мест нет");
        } else if (standingPlace) {
            System.out.println("в вагоне остались только стоячие места");
        } else if (seatingPlace) {
            System.out.println("в вагоне есть, сидячие и стоячие места");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        //пишем код для задачи 7
        int one = 6;
        int two = 9;
        int three = 9;
        if (one > two && one > three) {
            System.out.println("Первое число большее");
        } else if (two > one && two > three) {
            System.out.println("Второе число большее");
        } else if (three > one && three > two) {
            System.out.println("Третье число большее");
        }
        if (one == two && one == three) {
            System.out.println("все числа равны");
        } else if (one == two) {
            System.out.println("Перове и Второе число равны");
        } else if (one == three) {
            System.out.println("Перове и Третье число равны");
        } else if (two == three) {
            System.out.println("Второе и Третье число равны");
        }


    }
}