package Chapter9.Anonymous;

import Chapter9.InterfaceTest.LgTV;
import Chapter9.InterfaceTest.RemoteControl;
import Chapter9.InterfaceTest.SamsungTV;

public class CallbackTest2 {
    public void RemoteControl(RemoteControl rc) {
        rc.turnOn();
    }

    public static void main(String[] args) {
        CallbackTest2 cb = new CallbackTest2();
        // 무명 클래스로 RemoteControl 객체를 인자로 전달하시오.
        // 1. 변수 사용해서 전달
        // 2. 변수 사용하지 않고 전달
        // 화면에는 "파나소닉 TV가 켜졌습니다."
        // PanasonicTV tv = new PanasonicTV();
        // cb.RemoteControl(tv);
        cb.RemoteControl(new PanasonicTV());
        cb.RemoteControl(new SamsungTV());
        cb.RemoteControl(new LgTV());

        cb.RemoteControl(new RemoteControl() {
            public void turnOff() {
                System.out.println("No Brand TV를 끕니다.");
            }

            public void turnOn() {
                System.out.println("No Brand TV를 켭니다.");
            }
        });
    }
}

class PanasonicTV implements RemoteControl {

    @Override
    public void turnOn() {
        System.out.println("파나소닉 티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("파나소닉 티비를 끕니다.");
    }

}