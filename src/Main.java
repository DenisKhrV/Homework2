public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("Задача 1");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task3() {

        System.out.println("Задача 3");

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4 - 3.5;
        cat = cat + 4 - 1.6;
        paper = paper + 4 - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;

        System.out.println("Вес первого боксёра " + weightFirstBoxer + "кг");
        System.out.println("Вес второго боксёра " + weightSecondBoxer + "кг");

        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + "кг");

        var weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе между боксёрами " + weightDifference + "кг");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("Вес первого боксёра " + weightFirstBoxer + " кг");
        System.out.println("Вес второго боксёра " + weightSecondBoxer + " кг");
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес боксёров " + totalWeight + " кг");
        var weightDifference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница в весе между боксёрами с помощью остатка от деления " + weightDifference + " кг");
        var weightDifferenceSubtraction = weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница в весе между боксёрами c помощью вычитания " + weightDifferenceSubtraction + " кг");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var amountHours = 640;
        var amountHoursEmployee = 8;
        var totalEmployees = amountHours / amountHoursEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");
        totalEmployees=totalEmployees+94;
        amountHours=amountHoursEmployee*totalEmployees;
        System.out.println("Если в компании работает " +totalEmployees+ " человек, то всего " + amountHours+ " часов работы может быть поделено между сотрудниками");
    }
}