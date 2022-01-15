package com.example.java.lesson5;

/**
 * GENERAL METHODS DESCRIPTION
 */
public class Method {
    public static void main(String[] args) throws IllegalArgumentException {

        sayHello1();
        sayHello1();
        sayHello1();
        sayHello1();
        welcome();
    }

    static void sayHello1() {
        System.out.println("Hello");
        System.out.println("Hello-Again");
    }

    static void welcome() {
        System.out.println("Welcome to Java course");
    }

}
