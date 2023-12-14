package com.perscholas.java_basics;

public class OperatorsAndNumbers {
    public static void main(String[] args) {
        System.out.println("\n------task 3-------------");
        task3();

        System.out.println("\n------task 4-------------");
        task4();

        System.out.println("\n------task 4-------------");
        task5();

        System.out.println("\n------task 6-------------");
        task6();

        System.out.println("\n------task 7-------------");
        task7();
    }

    // task 3
    static void task3() {
        int x = 7;
        int y = 17;

        int z = x & y;

        System.out.printf("z = %d and binary version is: %s\n", z, Integer.toBinaryString(z));
    }

    // task 4
    static void task4() {
        int x = 7;
        int y = 17;

        int z = x | y;

        System.out.printf("z = %d and binary version is: %s\n", z, Integer.toBinaryString(z));
    }

    //task 5
    static void task5() {
        int num = 5;
        System.out.printf("before postfix increment: %d\n", num);
        num++;
        System.out.printf("after postfix increment: %d\n", num);
    }

    // task 6
    static void task6() {
        int num = 1;
        System.out.printf("number is: %d\n", num);
        num++;
        System.out.printf("number is: %d\n", num);
        ++num;
        System.out.printf("number is: %d\n", num);
        num += 1;
        System.out.printf("number is: %d\n", num);
    }

    static void task7() {
        int x = 5;
        int y = 8;

        // prefix on x
        int sum = ++x + y;
        System.out.printf("Prefix on x. sum = %d\n", sum);

        // reset x;
        x = 5;

        // postfix on x;
        sum = x++ + y;
        System.out.printf("Postfix on x. sum = %d\n", sum);
    }
}
