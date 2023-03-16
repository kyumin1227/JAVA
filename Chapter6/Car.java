package Chapter6;
public class Car {
    String color;
    int gear;
    int speed;
    int fe; //연비 Fuel efficiency

    Car(String c, int g, int s, int f) {
        color = c;
        gear = g;
        speed = s;
        fe = f;
    }

    public String toString() {
        return "Car [color = "+color+", speed = "+speed+", gear = "+gear+", Fuel efficiency = "+fe+"]";
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
    double getFuelEfficiency(double distance) {
        double result = Math.round((distance / fe)*1000);
        result /= 1000;
        return result;
    }
}