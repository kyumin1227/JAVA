package Chapter6;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1, e2, e3;
        e1 = new Employee("1번", 11111);
        e2 = new Employee("2번", 22222);
        e3 = new Employee("3번", 33333);

        System.out.println("현재의 직원수="+e1.getCount());
    }
}
