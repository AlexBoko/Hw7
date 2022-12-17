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
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int a = 10; a >= 1; a = a - 1) {
            System.out.println(a);
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        for (int c = 10; c >= -10; c = c - 1) {
            System.out.println(c);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + " год является високосным");
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        for (int a = 7; a <= 98; a = a + 7) {
            System.out.println(a);
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        for (int a = 1; a <= 512; a = a * 2) {
            System.out.println(a);
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task10() {
        System.out.println("Задача 10");
        int b = 2;
        for (int a = 1; a <= 10; a++) {
            System.out.println(b + "*" + a + "=" + b * a);
        }
    }
}

