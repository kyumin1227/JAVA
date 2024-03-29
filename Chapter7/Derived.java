package Chapter7;

public class Derived extends Base {
    public Derived() {
        // 부모 클래스의 생성자를 명시적으로 호출하지 않으면
        // 묵시적으로 호출됨. 이 때 묵시적으로 호출되는 부모 클래스 생성자는
        // 어떠한 인자도 가지지 않은 생성자
        // super("인자.");
        System.out.println("Derived() 생성자 호출됨.");
    }
    public Derived(String msg) {
        System.out.println("Derived() 생성자 호출됨.");
    }
}