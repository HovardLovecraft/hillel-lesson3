package com.example.java.lesson5;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        //TODO Write all tasks from lesson3 and lesson4 in methods

        Scanner scanner = new Scanner(System.in);

        printAllElementsDividedByArgument(2);
        System.out.println("");
        printAllElementsDividedByArgument(4);
        System.out.println(" ");
        printAllElementsDividedByArgument(5);

        int [] ints = {1, 2 ,3 ,4, 6};
        int [] ints1 = {1, 2 ,3 ,4, 6, 12, 124, 900};
        int [] ints2 = {-1, 2, 7, 90, 100, 87};
        int ourNumber = scanner.nextInt();

        printExpectedIntFromArray(ints, ourNumber);
        printExpectedIntFromArray(ints1, ourNumber);
        printExpectedIntFromArray(ints2, ourNumber);


    }

    static void printAllElementsDividedByArgument(int argument) {
        for (int i = 1; i <= 100; i++   ) {
            if (i%argument==0) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
    }

    static void printExpectedIntFromArray(int[] arr, int expectedNum) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == expectedNum) {
                System.out.println(arr[i]);
            }
        }
    }
}
