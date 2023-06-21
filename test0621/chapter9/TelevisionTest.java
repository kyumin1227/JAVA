package test0621.chapter9;

public class TelevisionTest {
    public static void main(String[] args) {
        Television tv1 = new Television();
        tv1.turnOn();
        tv1.turnOff();

        RemoteControl tv2 = new Television();
        tv2.turnOn();
        tv2.turnOff();
    }
}
