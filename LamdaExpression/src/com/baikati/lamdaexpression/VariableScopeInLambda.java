package com.baikati.lamdaexpression;

import java.util.List;

public class VariableScopeInLambda {
    //static int i=10;
    public static void main(String[] args) {
        int i = 10;
        EmployeeProducer.getAllEmployees().forEach(employee -> {
            System.out.println(employee + " " +i); //CE : Variable used in lambda expression should be final or effectively final
        });
       // i=11; // if we want assign value here we can un-comment line 6 and comment line 8
    }
}
