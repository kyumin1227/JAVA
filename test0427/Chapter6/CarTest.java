package test0427.Chapter6;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("Ray", "Yellow", 90);
        Car c2 = new Car("audi a8", "white", 140);
        Car c3 = new Car("Bents", "Black", 150);

        System.out.println(Car.getNumberOfCar());
    }
}
