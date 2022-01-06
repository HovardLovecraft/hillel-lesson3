package com.example.java;

import java.util.Scanner;

public class CaseSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int number = scanner.nextInt();


        //SHOW WITHOUT BREAK STATEMENT FIRST
        switch (number) {
            case 10:
                System.out.println("it's 10");
                break;
            case 20:
                System.out.println("it's 20");
                break;
            case 30:
                System.out.println("it's 30");
                break;
            default:
                System.out.println("Missed in both 10, 20 or 30");
        }
        System.out.println();
    }
}
