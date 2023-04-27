package test0427.Chapter5;

public class Car {
    private String color;
    private int gear;
    private int speed;

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp() {
        this.speed += 10;
    }

    public void speedDown() {
        this.speed -= 10;
    }

    @Override
    public String toString() {
        return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
    }
}
