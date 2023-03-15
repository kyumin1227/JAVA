package test;

public class StudentTest {
    public static void main(String[] args) {
        Student std = new Student();
        // std.name = "홍길동";
        // std.birthYear = 2002;

        std.setName("홍길동");
        std.setBirthYear(2001);

        System.out.println(std.getName());
        System.out.println(std.getAge());
    }
}
