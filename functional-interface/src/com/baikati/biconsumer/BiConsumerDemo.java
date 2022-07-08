package com.baikati.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        //print using BiConsumer
        BiConsumer<Integer, Integer> biConsumer = (val1, val2) -> System.out.println("val1 : " + val1 + " val2 : " + val2);
        biConsumer.accept(10, 20);

        //sum
        BiConsumer<Integer, Integer> addConsumer = (e1, e2) -> System.out.println("e1+e2 : " + (e1 + e2));
        addConsumer.accept(10, 20);

        //concat strings
        BiConsumer<String, String> concatConsumer = (input1, input2) -> System.out.println(input1 + input2);
        concatConsumer.accept("Java is ", "Object Oriented");
    }
}
