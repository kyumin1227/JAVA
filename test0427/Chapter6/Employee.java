package test0427.Chapter6;

public class Employee {
    private String name;
    private double salary;

    private static int count;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        count++;
    }

    public static int getCount() {
        return count;
    }

    protected void finalize() {
        count--;
    }
}
