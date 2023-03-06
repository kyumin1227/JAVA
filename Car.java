public class Car {
    String color;
    int gear;
    int speed;
    int fe; //연비 Fuel efficiency

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
        return distance / fe;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Yellow";
        myCar.gear = 2;
        myCar.speed = 80;
        myCar.fe = 15;
        myCar.speedUp();
        myCar.changeGear(3);
        System.out.println(myCar); //toString 호출
        double result = myCar.getFuelEfficiency(130);
        double fuel = Math.round(result*1000);

        System.out.println("필요한 연료는 "+fuel/1000+"L입니다.");
    }
}