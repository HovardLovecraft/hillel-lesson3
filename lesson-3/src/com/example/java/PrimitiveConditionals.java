package com.example.java;

public class PrimitiveConditionals {
    public static void main(String[] args) {
        int age = 16;
        int weight = 80;

        if(age > 18 && weight > 50) {
            System.out.println("You're able to donate blood");
        }

        String adult = age > 18 ? "Adult" : "Youngster";
        System.out.println(adult);
    }
}
