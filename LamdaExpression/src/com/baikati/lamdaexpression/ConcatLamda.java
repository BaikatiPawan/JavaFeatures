package com.baikati.lamdaexpression;

public class ConcatLamda {
    public static void main(String[] args) {
        ConcatInterface concatIntf = (str1, str2) -> str1+" "+str2;
        System.out.println(concatIntf.concat("Oracle","Jdk"));
    }
}
