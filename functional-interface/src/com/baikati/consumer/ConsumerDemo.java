package com.baikati.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = input -> System.out.println("length of " + input + " is : " + input.length());
        consumer.accept("Krishna");

        //block of code with consumer
        Consumer<Integer> consumer1 = input -> {
            System.out.println(input + " * " + input + " = " + input * input);
            System.out.println(input + " / " + input + " = " + input / input);
            System.out.println(input + " + " + input + " = " + (input + input));
            System.out.println(input + " - " + input + " = " + (input - input));
        };
        consumer1.accept(5);
    }
}
