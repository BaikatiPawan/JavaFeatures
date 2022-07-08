package com.baikati.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Double> sqrtFunction = val -> Math.sqrt(val);
        System.out.println(sqrtFunction.apply(81));
        System.out.println(sqrtFunction.apply(256));

        Function<String, String> lowercaseFunction = input -> input.toLowerCase();
        System.out.println(lowercaseFunction.apply("JAVA"));

        Function<String, String> concatFunction = str -> str.concat(" is Object Oriented");
        System.out.println(lowercaseFunction.andThen(concatFunction).apply("Java"));

        System.out.println(lowercaseFunction.compose(concatFunction).apply("Java"));
    }
}
