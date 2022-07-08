package com.baikati.consumer;

import java.util.List;
import java.util.function.Consumer;

public class EmployeeConsumerDemo {
      public static void main(String[] args) {
        List<Employee> employees = EmployeeProducer.getAllEmployees();
        Consumer<Employee> consumer = emp -> System.out.println(emp);
        employees.forEach(consumer);

        System.out.println("=============================================");
        Consumer<Employee> consumer1 = employee -> System.out.println(employee.getEmpName());
        employees.forEach(consumer1);
        System.out.println("=============================================");

        Consumer<Employee> consumer2 = emp -> System.out.println(emp.getSkills());
        employees.forEach(consumer2);
        System.out.println("=============================================");

        Consumer<Employee> consumer3 = emp -> System.out.println(emp.getDesignation());
        employees.forEach(consumer1.andThen(consumer2));
        System.out.println("=============================================");

        //Employee with more than 5 years exp
        employees.forEach(emp -> {
            if (emp.getExperience() > 5) {
                consumer.accept(emp);
            }
        });
        System.out.println("=============================================");

        //Employee with more than 5 years exp and who is giving training
        employees.forEach(emp -> {
            if (emp.getExperience() > 5 && emp.isTrainer()) {
                consumer1.andThen(consumer3).accept(emp);
            }
        });
    }
}
