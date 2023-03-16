package Chapter6;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("Yellow", 2, 80, 15);
        myCar.speedUp();
        myCar.changeGear(3);
        System.out.println(myCar); //toString 호출
        System.out.println("필요한 연료는 "+myCar.getFuelEfficiency(130)+"L입니다.");
    }
}
