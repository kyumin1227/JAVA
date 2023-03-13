package test;
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        // p.name = "홍길동";
        // p.age = 23;
        // p.age = -100;
        p.setAge(-20);
        String d = p.dept;
        System.out.println(p.getAge());

        System.out.println(p.getName());
        System.out.println(p.getDept());
    }
}
