package com.baikati.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        //if number >10 return true else false
        Predicate<Integer> predicate1 = input -> input > 10;
        System.out.println(predicate1.test(20));

        // input>10 and even
        Predicate<Integer> predicate2 = input -> input % 2 == 0;
        System.out.println(predicate1.and(predicate2).test(40));

        //input>10 or even
        System.out.println(predicate1.or(predicate2).test(15));

        //input>10 and odd
        System.out.println(predicate1.and(predicate2.negate()).test(15));
    }
}
