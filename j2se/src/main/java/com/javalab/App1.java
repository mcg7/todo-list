package com.javalab;

public class App1 {

    public static String greet(String greeting) {

        System.out.println(greeting);

        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }

        System.out.println("");

        return greeting;
    }
}
