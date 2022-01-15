package com.example.java.lesson5;

/**
 * METHODS OVERLOADING DESCRIPTION
 */
public class MethodsOverloading {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        double d = 4.0;
        double e = 4.0;
        double f = 4.0;
        String text = "text";
        String text2 = "text";


        String sum = sum(text, text2);


    }
    static int sum (int x, int y) {
        return x + y;
    }

    static int sum (int x, int y, int z) {
        return x + y + z;
    }

    static double sum (double x, double y, double z) {
        return x + y + z;
    }

    static String sum (String x, String y) {
        return x + " " + y;
    }

}


