package com.baikati.lamdaexpression;

public class GreetingImplLamda {
    public static void main(String[] args) {
        GreetingInterface greeting = () -> "Welcome";

        System.out.println(greeting.greet());
    }
}
