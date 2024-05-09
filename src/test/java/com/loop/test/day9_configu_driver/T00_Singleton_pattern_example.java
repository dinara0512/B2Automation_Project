package com.loop.test.day9_configu_driver;

public class T00_Singleton_pattern_example {
    //private constructor to prevent  external instantiation
    private T00_Singleton_pattern_example() {
    }

    private static String word;

    //public getter
    public static String getWord() {
        if (word == null) {
            System.out.println("First time calling, Object is null and assigning now");
            word = "driver";
        } else {
            System.out.println("word is already assigned and ahs value");
        }
        return word;
    }
}


