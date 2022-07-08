package com.baikati.biPredicate;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class BiPredicateDemo {
    public static void main(String[] args) {
        BiPredicate<Integer,Boolean> biPredicate = (input1, input2)-> input1>5 && input2==true;

        List<Employee> employees = EmployeeProducer.getAllEmployees();

        //BiConsumer name and skills
        BiConsumer<String, List<String>> biConsumer = (name, skills) -> System.out.println("Name : "+name+" skills : "+skills);

        employees.forEach(employee -> {
            if(biPredicate.test(employee.getExperience(),employee.isTrainer())){
                biConsumer.accept(employee.getEmpName(), employee.getSkills());
            }
        });
    }
}
