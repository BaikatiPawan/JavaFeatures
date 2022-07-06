package com.baikati.lamdaexpression;

public class GreetingImpl implements GreetingInterface{
    @Override
    public String greet() {
        return "Welcome";
    }

    public static void main(String[] args) {
        GreetingImpl greeting = new GreetingImpl();
        System.out.println(greeting.greet());
    }
}
