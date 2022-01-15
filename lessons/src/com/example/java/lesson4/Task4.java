package com.example.java.lesson4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Height");
        int height = scanner.nextInt();
        System.out.println("Width");
        int width = scanner.nextInt();




        int[][] matrix = new int[height][width];
        int[][] testMatrix = {{1, 2, 3},
                              {12, 78, 5},
                              {6, 66, 77}};

        System.out.println(testMatrix[0][0]);
        System.out.println(testMatrix[0][1]);
        System.out.println(testMatrix[0][2]);
        System.out.println(testMatrix[1][0]);
        System.out.println(testMatrix[1][1]);
        System.out.println(testMatrix[1][2]);
        System.out.println(testMatrix[2][0]);
        System.out.println(testMatrix[2][1]);
        System.out.println(testMatrix[2][2]);


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                char symbol = matrix[i][j] == 1 ? '*' : '#';
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
