package com.baikati.predicate;

import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PredicateDemo3 {
    public static void main(String[] args) {
        IntPredicate predicate1 = i -> i > 100;
        System.out.println(predicate1.test(10));

        LongPredicate predicate2 = i -> i > 1000L;
        System.out.println(predicate2.test(1111111111111111111L));

        DoublePredicate predicate3 = i -> i < 101.40;
        DoublePredicate predicate4 = i -> i > 101.10;
        System.out.println(predicate3.and(predicate4).test(101.30));

    }
}
