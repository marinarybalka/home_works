package com.javabasic.hillel;

public class MyFirstMain {

    public static void main(String[] args) {
        int abs = Math.abs(-45);

        System.out.println(abs);

        double sqrt = Math.sqrt(25);
        System.out.println(sqrt);

        double x1 = 29.15;
        double result = Math.pow(1.1, x1) + Math.abs(Math.cos(Math.sqrt(Math.PI + x1))) + (3.0/ 8.0);

        System.out.println(result);

    }
}

