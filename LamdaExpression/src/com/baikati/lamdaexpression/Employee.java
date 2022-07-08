package com.baikati.lamdaexpression;

import java.util.List;

public class Employee {
    private int empId;
    private String empName;
    private String designation;
    private int experience;
    private List<String> skills;
    private boolean isTrainer;

    public Employee(int empId, String empName, String designation, int experience, List<String> skills, boolean isTrainer) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.experience = experience;
        this.skills = skills;
        this.isTrainer = isTrainer;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isTrainer() {
        return isTrainer;
    }

    public void setTrainer(boolean trainer) {
        isTrainer = trainer;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", designation='" + designation + '\'' +
                ", experience=" + experience +
                ", skills=" + skills +
                ", isTrainer=" + isTrainer +
                '}';
    }
}
