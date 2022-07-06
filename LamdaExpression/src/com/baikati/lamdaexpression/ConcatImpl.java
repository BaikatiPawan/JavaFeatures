package com.baikati.lamdaexpression;

public class ConcatImpl implements ConcatInterface{
    @Override
    public String concat(String str1, String str2) {
        return str1+" "+str2;
    }

    public static void main(String[] args) {
        ConcatImpl impl = new ConcatImpl();
        String result = impl.concat("Oracle","Jdk");
        System.out.println(result);

    }
}
