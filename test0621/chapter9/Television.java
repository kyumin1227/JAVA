package test0621.chapter9;

public class Television implements RemoteControl {
    boolean onOff = false;

    @Override
    public void turnOn() {
        onOff = true;
    }

    @Override
    public void turnOff() {
        onOff = false;
    }

}
