package Chapter9.InterfaceTest;

public interface RemoteControl {
    void turnOn();

    void turnOff();

    // // SamsungTV와 LgTV가 만들어 진 이후 추가
    // default void volumeControl(int amount) {
    // String st = null;
    // st = amount > 0 ? "높입니다." : "줄입니다.";
    // amount = Math.abs(amount);
    // System.out.println("볼륨을 " + amount + " 만큼 " + st);
    // }
}
