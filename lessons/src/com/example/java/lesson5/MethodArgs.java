package com.example.java.lesson5;

import java.util.Scanner;

/**
 * ARGUMENTS DESCRIPTION
 */
public class MethodArgs {
    public static void main(String[] args) {


        String name = "Ivan";

        sayHello(name);


    }

    static void sum(int x, int y) {
        System.out.println(x + y);

    }

    static void sayHello(String name) {
        System.out.println("Hello" + name);
    }
}
