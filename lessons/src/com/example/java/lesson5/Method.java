package com.example.java.lesson5;

/**
 * GENERAL METHODS DESCRIPTION
 */
public class Method {
    public static void main(String[] args) throws IllegalArgumentException {

        sayHello();
        sayHello();
        sayHello();
        sayHello();
        welcome();
    }

    static void sayHello() {
        System.out.println("Hello");
    }

    static void welcome() {
        System.out.println("Welcome to Java course");
    }

}
