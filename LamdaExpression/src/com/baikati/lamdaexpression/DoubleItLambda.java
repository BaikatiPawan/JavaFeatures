package com.baikati.lamdaexpression;

public class DoubleItLambda {
    public static void main(String[] args) {
        DoubleItInterface intf = (val) -> val * 2;
        int result = intf.doubleIt(5);
        System.out.println(result);
    }
}
