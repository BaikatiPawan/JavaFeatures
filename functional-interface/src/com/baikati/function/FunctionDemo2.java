package com.baikati.function;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo2 {
    public static void main(String[] args) {

        //Map of Employees with name and experience
        //Function which will take List<Employee> and return Map<String,Integer>
        Function<List<Employee>, Map<String, Integer>> mapFunction = employees -> {
            Map<String, Integer> dataMap = new HashMap<>();
            employees.forEach(employee -> {
                dataMap.put(employee.getEmpName(), employee.getExperience());
            });
            return dataMap;
        };
        System.out.println(mapFunction.apply(EmployeeProducer.getAllEmployees()));

        //Map of Employees with name and designation
        //Function which will take List<Employee> and return Map<String,String>
        Function<List<Employee>, Map<String, String>> function = input -> {
            Map<String, String> dataMap = new HashMap<>();
            input.forEach(e -> {
                dataMap.put(e.getEmpName(), e.getDesignation());
            });
            return dataMap;
        };
        System.out.println(function.apply(EmployeeProducer.getAllEmployees()));

        //Employee who is having skill as Java
        Predicate<String> predicate = val -> val.equalsIgnoreCase("Java");
        Function<List<Employee>, List<String>> listFunction = emps -> {
            List<String> list = new ArrayList<>();
            emps.forEach(emp -> {
                emp.getSkills().forEach(skill -> {
                    if (predicate.test(skill)) {
                        list.add(emp.getEmpName());
                    }
                });

            });
            return list;
        };
        System.out.println(listFunction.apply(EmployeeProducer.getAllEmployees()));
    }
}
