package com.example.java;

import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number and press enter");
        int first = scanner.nextInt();
        System.out.println("Enter second number and press enter");
        int second = scanner.nextInt();
        System.out.println("Enter third number and press enter");
        int third = scanner.nextInt();


//        BAD PRACTICE SOLUTION
//        if (first > second) {
//            if (first > third) {
//                System.out.println("the greatest number is " + first);
//            }
//        }
//        if (second > first) {
//            if (second > third) {
//                System.out.println("the greatest number is " + second);
//            }
//        }
//        if (third > first) {
//            if (third > second) {
//                System.out.println("the greatest number is " + third);
//            }
//        }

//        SOLUTION WITH IF/ELSE
        if (first > second) {
            System.out.println("the greatest number is " + first);
        } else if (second > third) {
            System.out.println("the greatest number is " + second);
        } else {
            System.out.println("the greatest number is " + third);
        }

//        SECOND SOLUTION WITH TERNARY
        int result = first > second && first > third ? first : second;
        result = result > third ? result : third;
        System.out.println("the greatest number is " + result);


//        THIRD SOLUTION WITH MATH MAX
        int mathResult = Math.max(first, second);
        mathResult = Math.max(mathResult, third);
        System.out.println("the greatest number is " + mathResult);

    }
}
