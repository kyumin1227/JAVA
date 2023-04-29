package test0427.Chapter6;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("kyumin", 1000);
        Employee e2 = new Employee("minkyu", 1000);

        System.out.println(Employee.getCount());
    }
}
