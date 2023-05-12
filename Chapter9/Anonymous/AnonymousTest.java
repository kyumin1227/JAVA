package Chapter9.Anonymous;

import Chapter9.InterfaceTest.LgTV;
import Chapter9.InterfaceTest.RemoteControl;
import Chapter9.InterfaceTest.SamsungTV;
import Chapter9.InterfaceTest.Student;

public class AnonymousTest {
    public static void main(String[] args) {
        RemoteControl rt1 = new SamsungTV();
        rt1.turnOff();

        RemoteControl rt2 = new LgTV();
        rt2.turnOn();

        // 무명 클래스를 이용한 객체
        RemoteControl rt3 = new RemoteControl() {

            @Override
            public void turnOn() {
                System.out.println("Sony TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Sony TV를 끕니다.");
            }

        };

        // 무명클래스를 만들 때(아래 부모클래스 이름은 인터페이스 이름을 포함한 용어)
        // new 부모클래스 이름(부모클래스의 생성자에게 전달할 인자 리스트) { 클래스 정의 }
        // 👍 무명클래스를 만들 때는 제약이 있는데, 새로운 생성자를 정의할 수 없다.
        Student st1 = new Student("kyumin", "컴정") {
            // 무명 클래스란 클래스의 정의와 객체 생성을 한 문장으로 해결하는 것이다.
            // 무명 클래스는 생성자를 정의할 수 없다.
            // 생성자는 클래스 이름과 같아야 하는데, 무명 클래스는 클래스 이름이 없다.
            // 그렇다고 부모 클래스의 이름으로 생성자를 만들 수도 없다.

            // 무명 클래스 표현식의 구성 다음과 같다.
            // 1. new 연산자
            // 2. 구현할 인터페이스 이름 또는 상속할 클래스 이름
            // 3. 괄호() -> 생성자에게 전달할 인자를 포함하는 괄호
            // 주의: 인터페이스를 구현하는 경우, 인터페이스는 생성자가 없기 때문에 괄호는 어떠한 인자도 포함하지 않는다.
            // 4. 몸체: 클래스 정의 부분
            // 5. 세미클론
            @Override
            public String getName() {
                return super.getName();
            }

            public void printName() {
                System.out.println("학생의 이름은: " + getName());
            }
        };

        System.out.println(st1.getName());
    }

}
