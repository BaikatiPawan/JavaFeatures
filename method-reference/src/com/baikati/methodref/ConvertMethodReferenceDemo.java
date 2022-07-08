package com.baikati.methodref;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConvertMethodReferenceDemo {
    public static void main(String[] args) {
        Predicate<Instructor> predicate = ConvertMethodReferenceDemo::getExpGreaterThanFiveYears;
        Instructors.getAll().forEach(instructor -> {
            if (predicate.test(instructor)) {
                System.out.println(instructor);
            }
        });

        System.out.println("==============================");
        ConvertMethodReferenceDemo methodReferenceDemo = new ConvertMethodReferenceDemo();
        Predicate<Instructor> predicate1 = methodReferenceDemo::getExpLessthanSevenYears;
        Instructors.getAll().forEach(instructor -> {
            if (predicate1.test(instructor)) {
                System.out.println(instructor);
            }
        });

        System.out.println("============================");
        BiFunction<Integer, String, Person> function = Person::new;
        System.out.println(function.apply(1, "Bob"));

    }

    public static boolean getExpGreaterThanFiveYears(Instructor instructor) {
        if (instructor.getYearsOfExperience() > 5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getExpLessthanSevenYears(Instructor instructor) {
        if (instructor.getYearsOfExperience() < 7) {
            return true;
        } else {
            return false;
        }
    }
}
