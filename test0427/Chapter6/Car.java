package test0427.Chapter6;

public class Car {
    private String model;
    private String color;
    private int speed;

    private int id;
    private static int number = 0;

    public Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;

        this.id = ++number;
    }

    public static int getNumberOfCar() {
        return number;
    }
}
