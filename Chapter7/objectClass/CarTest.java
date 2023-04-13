package Chapter7.objectClass;

public class CarTest {
    public static void main(String[] args) {
        // Car car = new Car();
        // Class classvar = car.getClass();
        // System.out.println(classvar.getName());

        // System.out.println("브랜드: " + car.brand + ", " + "모델: " + car.model);

        Car car1 = new Car("현대", "그랜져");
        Car car2 = new Car("현대", "그랜져");

        System.out.println(car1.equals(car2));
        System.out.println(car1 == car2);
    }
}
