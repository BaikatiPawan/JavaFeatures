package com.baikati.lamdaexpression;

import java.util.Arrays;
import java.util.List;

public class EmployeeProducer {
    public static List<Employee> getAllEmployees() {
        List<Employee> employees = Arrays.asList(new Employee(101, "Krish", "Devops Engineer", 10, Arrays.asList("Java", "Kubernetes", "AWS", "Docker"), true),
                new Employee(102, "Greg", "Senior Software Engineer", 5, Arrays.asList("Java", "Python", "Linux"), false),
                new Employee(110, "Suresh", "Test Engineer", 5, Arrays.asList("Manual Testing", "Automation Testing"), false),
                new Employee(103, "Pawan", "Software Developer", 6, Arrays.asList("Java", "Spring boot", "JPA"), true),
                new Employee(104, "Priya", "HR", 5, Arrays.asList("HR Operations", "Payroll"), true));

        return employees;
    }
}
