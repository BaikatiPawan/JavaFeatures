package com.baikati.unaryoperator;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        IntUnaryOperator unaryFunction = val -> val * 10;
        System.out.println(unaryFunction.applyAsInt(10));

        LongUnaryOperator longUnary = e -> e * 10;
        System.out.println(longUnary.applyAsLong(2000000000l));

        DoubleUnaryOperator doubleOperator = input -> input*10;
        System.out.println(doubleOperator.applyAsDouble(1225450.540000));
    }
}
