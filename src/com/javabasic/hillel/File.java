package com.javabasic.hillel;

public class File {

    public static void main(String[] args) {

        double x = 25.15;
        double result9 = Math.pow(1.1, x) + Math.abs(Math.cos(Math.sqrt(Math.PI * x))) - (3.0 / 8.0);
        System.out.println(result9);
        System.out.println(3.0 / 8.0);

        double x25 = 45.89;
        double result25 = Math.sqrt(Math.sqrt(Math.log10(Math.acos(Math.abs(Math.pow(x25, 3.4) + 2.5 * Math.pow(x25, 1.2)-0.7/Math.cbrt(Math.pow(Math.exp(2.5 * x25), x25))))))) + 1;
        System.out.println(result25);

        double x1 = 20.15;
        double result = Math.pow(1.1, -x1) + Math.abs(Math.cos(Math.sqrt(Math.PI * x1))) - (3.0/ 8.0);
        System.out.println(result);

    }
}
