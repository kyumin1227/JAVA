package Chapter9.Anonymous;

import java.lang.reflect.Method;

public class Test {
    public void test(MyInterface1 m1) {
        m1.print("Hello World");
    }

    public static void main(String[] args) {
        Test t = new Test();
        // 1. 무명 클래스를 이용해 Test 클래스의 인스턴스 메소드 test를 호출
        // t.test(new MyInterface1() {

        // @Override
        // public void print(String s) {
        // System.out.println(s);
        // }

        // });
        // 2. 람다를 이용해 Test 클래스의 인스턴스 메소드 test를 호출
        // 인터페이스인데 오직 하나의 추상 메소드를 가지는 인터페이스는 람다로 구현할 수 있다.
        // t.test((s) -> {
        // System.out.println(s);
        // });

        t.test(s -> System.out.println(s));
    }

    // public static int sum(int n1, int n2, int n3,

    // public int add(int n1, int n2) -> {return n1+n2;}) {
    // int result = add(n1, n2);
    // result = add(result, n3);
    // return result;
    // }

    // public static int add(int n1, int n2) {
    // return (n1 + n2);
    // }

}