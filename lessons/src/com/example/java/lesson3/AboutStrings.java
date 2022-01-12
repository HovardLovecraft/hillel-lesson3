package com.example.java.lesson3;

public class AboutStrings {
    public static void main(String[] args) {
        String str1 = "Java dfs`ldkfsldkjf sdf";
        String str2 = new String(); // empty string
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -initial index, 4 -symbols qty

//        char[] chars = new char[]{};
//        str1.toCharArray();
//        chars[2] = 'c';



        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come

        int strLength = str1.length();
        System.out.println(strLength);
    }
}
