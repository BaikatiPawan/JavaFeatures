package com.baikati.methodref;

import java.util.List;

public class Instructor {
    private int id;
    private String name;
    private int yearsOfExperience;
    private List<String> courses;
    private boolean isOnlineCourse;

    public Instructor(int id, String name, int yearsOfExperience, List<String> courses, boolean isOnlineCourse) {
        this.id = id;
        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.courses = courses;
        this.isOnlineCourse =isOnlineCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public List<String> getCourses() {
        return courses;
    }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    public boolean isOnlineCourse() {
        return isOnlineCourse;
    }

    public void setOnlineCourse(boolean onlineCourse) {
        isOnlineCourse = onlineCourse;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", courses=" + courses +
                ", isOnlineCourse=" + isOnlineCourse +
                '}';
    }
}
