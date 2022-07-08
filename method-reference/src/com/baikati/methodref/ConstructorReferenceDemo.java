package com.baikati.methodref;

import java.util.Arrays;

public class ConstructorReferenceDemo {
    public static void main(String[] args) {
        InstructorFactory factory = Instructor::new;
        Instructor instructor = factory.getInstructor(1, "Pawan", 6, Arrays.asList("Java", "Docker", "Springboot", "Python"), true);
        System.out.println(instructor);
    }
}
