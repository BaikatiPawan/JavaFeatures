package com.baikati.binaryoperator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorDemo {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(10, 20));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(10, 20));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(10, 20));

        IntBinaryOperator intBinary = (a, b) -> a * b;
        System.out.println(intBinary.applyAsInt(10, 20));

        LongBinaryOperator longBinary = (a,b)-> a*b;
        System.out.println(longBinary.applyAsLong(222222222l,2222222222l));

        DoubleBinaryOperator doubleBinary = (a,b)->a*b;
        System.out.println(doubleBinary.applyAsDouble(10343.4533,2343.42122));

    }
}
