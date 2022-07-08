package com.baikati.predicate;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class PredicateAndBiConsumerDemo {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeProducer.getAllEmployees();

        //Employee who is trainer
        Predicate<Employee> predicate1 = emp -> emp.isTrainer() == true;

        //experience >5
        Predicate<Employee> predicate2 = emp -> emp.getExperience() > 5;

        //Employee who is trainer and having experience >5
        BiConsumer<String,List<String>> biConsumer = (name, skills) -> System.out.println("Name : "+name+" skills : "+skills);
        employees.forEach(employee -> {
            if(predicate1.and(predicate2).test(employee)){
                biConsumer.accept(employee.getEmpName(), employee.getSkills());
            }
        });
    }
}
