package com.baikati.methodref;

public class Person {
    private int ssn;
    private String name;

    public Person() {

    }

    public Person(int ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "ssn=" + ssn +
                ", name='" + name + '\'' +
                '}';
    }
}
