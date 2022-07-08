package com.baikati.predicate;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.List;
import java.util.function.Predicate;

public class PredicateDem02 {


    public static void main(String[] args) {

        //Employee who is trainer
        Predicate<Employee> predicate1 = e1 -> e1.isTrainer() == true;
        List<Employee> employees = EmployeeProducer.getAllEmployees();
        employees.forEach(employee -> {
            if (predicate1.test(employee)) {
                System.out.println(employee);
            }
        });
        System.out.println("=====================");
        Predicate<Employee> predicate2 = input-> input.getExperience()>5;
        //Employee who is trainer and having exp >5
        employees.forEach(employee -> {
            if(predicate1.and(predicate2).test(employee)){
                System.out.println(employee);
            }
        });
    }
}
