package Chapter9.InterfaceTest;

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
            // 무명 클래스는 생성자를 정의할 수 없다.
            // 생성자는 클래스 이름과 같아야 하늗네, 무명 클래스는 클래스 이름이 없다.
            // 그렇다고 부모 클래스의 이름으로 생성자를 만들 수도 없다.
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
