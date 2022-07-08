package com.baikati.methodref;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceDemo {

    public static void main(String[] args) {

        Function<Integer, Double> sqrt = e -> Math.sqrt(e);
        System.out.println(sqrt.apply(81));

        Function<Integer, Double> sqrt1 = Math::sqrt;
        System.out.println(sqrt.apply(81));

        Function<String, String> uppercase = val -> val.toUpperCase();
        System.out.println(uppercase.apply("java"));

        Function<String, String> lowercase = String::toLowerCase;
        System.out.println(lowercase.apply("JAVA"));

        System.out.println("===========");
        Predicate<Instructor> instPredicate = instructor1 -> instructor1.isOnlineCourse();
        Instructors.getAll().forEach(instructor -> {
            if (instPredicate.test(instructor)) {
                System.out.println(instructor);
            }
        });

        System.out.println("======================");
        Predicate<Instructor> predicate = Instructor::isOnlineCourse;
        Instructors.getAll().forEach(instructor -> {
            if (predicate.test(instructor)) {
                System.out.println(instructor);
            }
        });
    }
}
