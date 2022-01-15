package com.example.java.lesson5;

/**
 * METHOD WITH RETURN TYPES
 */
public class MethodReturnValue {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        sum(a, b);

        int sumOfAAndB = sum(a, b);
        System.out.println(sumOfAAndB);

        String name = "Ivan";
        String name1 = "Oleksiy";
        String name2 = "Mariia";

        sayHello(name);

        System.out.println(sayHello(name));
        String sayHelloToIvan = sayHello(name);
        String sayHelloToOleksii = sayHello(name1);
        String sayHelloToMariia = sayHello(name2);

        System.out.println(sayHelloToIvan);
        System.out.println(sayHelloToOleksii);
        System.out.println(sayHelloToMariia);

        String result = doSomething(name);
        System.out.println(result);

    }

    static int sum(int x, int y) {

        return x + y;
    }

    static String sayHello(String name) {
        return "Hello " + name;
    }

    static String doSomething(String text) {
        String textPrefix = "azazaz ";
        String suffix = " That's all";
        return textPrefix + text + suffix;

    }
}
