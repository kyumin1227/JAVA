package test;

import java.time.LocalDate;

public class Student {
    private String name;
    private int birthYear;
    private String dept;
    private String address;

    public Student(String name, int birthYear, String dept, String address) {
        this.name = name;
        this.birthYear = birthYear;
        this.dept = dept;
        this.address = address;
    }

    public Student() {          //constructor overloading

    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBirthYear(int birthYear) {
        if(birthYear>=1900) {
            this.birthYear = birthYear;
            return;
        }
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        LocalDate d = LocalDate.now();
        int year = d.getYear();
        return (year-birthYear);
    }
}
