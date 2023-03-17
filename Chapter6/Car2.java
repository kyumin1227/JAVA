package Chapter6;

public class Car2 {
    private int speed;
    private String name;
    
    public Car2() {
        System.out.println("속도는 "+speed);
    }
    
    // 인스턴스 초기화 블록(instance initialization block)
    {
        speed = 100;
    }

    public Car2(String name) {
        this.name = name;
        System.out.println("속도는 "+speed);
    }

    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("그렌져");
    }
}
