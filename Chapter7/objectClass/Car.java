package Chapter7.objectClass;

public class Car {
    String brand;
    String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car() {
        this("Unknown", "Unknown");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        // obj가 Car 클래스의 인스턴스가 아니면 바로 false를 반환하자.
        // 자바에는 이 목적으로 사용할 수 있는 연산자(+, - , *, /, %, ...와 같은)
        // instanceof 가 있다.
        if (obj instanceof Car == false)
            return false;
        // obj는 Car 클래스의 객체라 가정한다
        // 그래야, Car 클래스의 인스턴스의 brand, model 멤버에 접근할 수 있다
        // 하향 형변환
        Car yourCar = (Car) obj;
        if (yourCar.brand.equals(brand) && yourCar.model.equals(model)) {
            return true;
        }
        return false;
    }
}