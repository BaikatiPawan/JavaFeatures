package com.baikati.biPredicate;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionDemo1 {
    public static void main(String[] args) {
        /*
            BiFunction with two inputs first input is List<Employee> and second input is Predicate which will filter
            the employee who is trainer and return Map<String,Integer> (name, experience)
         */
        Predicate<Employee> predicate = employee -> employee.isTrainer()==true;
        BiFunction<List<Employee>, Predicate<Employee>, Map<String,Integer>> biFunction = ((employees, empPredicate) ->{
           Map<String,Integer> dataMap = new HashMap<>();
           employees.forEach(employee -> {
               if(empPredicate.test(employee)){
                   dataMap.put(employee.getEmpName(), employee.getExperience());

               }
           });
           return dataMap;
        });
        System.out.println(biFunction.apply(EmployeeProducer.getAllEmployees(),predicate));

    }
}
