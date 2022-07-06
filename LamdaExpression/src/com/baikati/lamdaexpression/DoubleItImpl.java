package com.baikati.lamdaexpression;

public class DoubleItImpl implements DoubleItInterface {
    @Override
    public int doubleIt(int input) {
        return input * 2;
    }

    public static void main(String[] args) {
        DoubleItImpl doubleItImpl = new DoubleItImpl();
        int result = doubleItImpl.doubleIt(15);
        System.out.println(result);

    }
}
