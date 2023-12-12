package com.perscholas.java_basics;

public class Variables {
    public static void main(String[] args) {
        sumIntegers();
        sumDoubles();
        sumMixTypes();
        divideMixTypes();
        divideDoubles();
        divideIntegers();
        calcCircleArea();
        calcSaleTax();
    }

    // task 1
    static void sumIntegers() {
        int a = 1, b = 2;
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    // task 2
    static void sumDoubles() {
        double a = 1.1, b = 2.2;
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    // task 3
    static void sumMixTypes() {
        double a = 1.1;
        int b = 2;
        double sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);
    }

    // task 4
    static void divideMixTypes() {
        int a = 2;
        int b = 5;
        int result = b / a;
        System.out.println("Result is integer." + b + " / " + a + " = " + result);

        // change larger number to decimal
        double c = 5;

        double demicalResult = c / a;
        System.out.println("Result is double. " + c + " / " + a + " = " + demicalResult);
    }

    // task 5
    static void divideDoubles() {
        double a = 2;
        double b = 5;
        System.out.println(b + " / " + a + " = " +  b / a);

        System.out.println("Result casted to integer. " + b + " / " + a + " = " +  (int)(b / a));
    }

    // task 6
    static void divideIntegers() {
        int x = 5;
        int y = 6;
        double q = y / x;
        System.out.print("Dividing two integers: ");
        System.out.println(y + " / " + x + " = " +  q);
        q = (double)y / x;
        System.out.println("Larger number was casted to double. " + y + " / " + x + " = " +  q);
    }

    // task 7
    static void calcCircleArea() {
        final double PI = 3.1417;
        int radius = 2;
        System.out.printf("Circle area (r=%d) = %f\n", radius, PI * PI * radius);
    }

    // task 8
    static void calcSaleTax() {
        final double SALES_TAX = 0.10;

        double coffee = 11.99;
        double cappuccino = 5.99;
        double tea = 2.99;

        double subtotal = 0;
        double totalSale = 0;

        subtotal= 3 * coffee + 4 * cappuccino + 2 * tea;
        totalSale = subtotal + subtotal * SALES_TAX;

        System.out.printf("total sales: %.2f", totalSale);
    }
}
