package com.example.java;

import java.util.Arrays;
import java.util.List;

public class LogicalOperators {
    public static void main(String[] args) {
        //==
        int a = 10;
        int b = 4;
        boolean c = a == b;         // false
        boolean d = a == 10;       // true

//!=
//        int a = 10;
//        int b = 4;
//        boolean c = a != b;         // true
//        boolean d = a != 10;       // false

//<
//        int a = 10;
//        int b = 4;
//        boolean c = a < b;   // false

//>
//        int a = 10;
//        int b = 4;
//        boolean c = a > b;   // true

//>=
//        boolean c = 10 >= 10;    // true
//        boolean b = 10 >= 4;     // true
//        boolean d = 10 >= 20;    // false


//<=
//        boolean c = 10 <= 10;    // true
//        boolean b = 10 <= 4;     // false
//        boolean d = 10 <= 20;    // true


        //LOGICAL OPERATIONS
        boolean a1 = (5 > 6) || (4 < 6); // 5 > 6 - false, 4 < 6 - true, поэтому возвращается true
        boolean a2 = (5 > 6) || (4 > 6); // 5 > 6 - false, 4 > 6 - false, поэтому возвращается false
        boolean a3 = (5 > 6) && (4 < 6); // 5 > 6 - false, поэтому возвращается false (4 < 6 - true, но не вычисляется)
        boolean a4 = (50 > 6) && (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается true
        boolean a5 = (5 < 6) ^ (4 > 6); // 5 < 6 - true, поэтому возвращается true (4 > 6 - false)
        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // 50 > 6 - true, 4/2 < 3 - true, поэтому возвращается false
        List<Boolean> booleanList = Arrays.asList(a1, a2, a3, a4, a5, a6);
        booleanList.forEach(System.out::println);
    }
}
