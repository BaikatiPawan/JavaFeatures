package com.baikati.biconsumer;

import com.baikati.consumer.Employee;
import com.baikati.consumer.EmployeeProducer;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerDemo2 {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeProducer.getAllEmployees();

        //printing name and designation using BiConsumer
        BiConsumer<String, String> biConsumer = (name, designation) -> System.out.println("Name is : " + name + " and Designation is : " + designation);
        employees.forEach(employee -> {
            biConsumer.accept(employee.getEmpName(), employee.getDesignation());
        });
        System.out.println("===============================================");

        //printing name and skills using BiConsumer
        BiConsumer<String, List<String>> nameSkillConsumer = (name, skills) -> System.out.println("Name : " + name + " skills : " + skills);
        employees.forEach(employee -> {
            nameSkillConsumer.accept(employee.getEmpName(), employee.getSkills());
        });
        System.out.println("===============================================");

        //printing name and designation who is trainer
        BiConsumer<String, String> trainerConsumer = (name, designation) -> System.out.println("Name : " + name + " Designation : " + designation);
        employees.forEach(employee -> {
            if (employee.isTrainer()) {
                trainerConsumer.accept(employee.getEmpName(), employee.getDesignation());
            }
        });

    }
}
