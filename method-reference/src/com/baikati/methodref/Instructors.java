package com.baikati.methodref;

import java.util.Arrays;
import java.util.List;

public class Instructors {
    static List<Instructor> getAll() {
        List<Instructor> instructors = Arrays.asList(new Instructor(101, "Krishna", 9, Arrays.asList("Docker", "Kubernetes", "AWS"), true),
                new Instructor(102, "Ramesh", 3, Arrays.asList("Python", "Automation Testing"), false),
                new Instructor(103, "Priya", 6, Arrays.asList("HR", "Payroll"), false),
                new Instructor(104, "Pawan", 6, Arrays.asList("Java", "Docker", "Spring boot", "GCP"), true),
                new Instructor(105, "Chandra", 4, Arrays.asList("Hadoop", "Java"), false)
        );
        return instructors;
    }
}
