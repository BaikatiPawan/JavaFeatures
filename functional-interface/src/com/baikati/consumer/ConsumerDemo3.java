package com.baikati.consumer;

import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerDemo3 {
    public static void main(String[] args) {
        IntConsumer intConsumer = e -> System.out.println(e * 10);
        intConsumer.accept(10);

        LongConsumer longConsumer = val -> System.out.println(val * 10);
        longConsumer.accept(10);

        DoubleConsumer doubleConsumer = value -> System.out.println(value * 10);
        doubleConsumer.accept(10);

    }
}
