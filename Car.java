public class Car {
    String color;
    int gear;
    int speed;

    public String toString() {
        return "Car [color = "+color+", speed = "+speed+", gear = "+gear+"]";
    }

    void changeGear(int x) {
        gear = x;
    }
    void speedUp() {
        speed += 5;
    }
    void speedDown() {
        speed -= 5;
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Yellow";
        myCar.gear = 2;
        myCar.speed = 80;
        myCar.speedUp();
        myCar.changeGear(3);
        System.out.println(myCar); //toString 호출
    }
}
