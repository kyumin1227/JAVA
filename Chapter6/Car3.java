package Chapter6;

public class Car3 {
    
    private String model;
    private String color;
    private int speed;

    // 상수란? : 한번 초기화되면 절대 값을 변경할 수 없는 값
    // 자바에서 상수를 만드는 법 : final keyword 사용.
    // 자바에서 상수는 static으로 만드는 것이 바람직.
    // 상수는 대문자로 사용하는 것이 관례
    // 상수는 일반적으로 public으로 선언된다.
    public static final int MAX_SPEED;
    // 정적 멤버는 정적 초기화 블록을 통해 초기화
    static
    {
        MAX_SPEED = 350;
        System.out.println("MAX_SPEED가 초기화 되었습니다.");
    }

    // 초기화 블록은 생성자의 가장 첫 부분에 복사
    {
        model = "그랜저";
        color = "흰색";
    }

    // 자동차의 시리얼 넘버
    private int id;
    // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자.
    private static int numbers = 0;

    // static method는 instance method를 호출할 수 없다.
    public static int getNumbers() {
        // print();
        return numbers;
    }

    // instance method는 instance가 존재해야 이용가능한 메소드
    public void print() {
        System.out.println("HI~~~~~~~~");
    }

    public Car3(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.id = ++numbers;
        // max_speed = 500;
    }

    // 생성자
    /* id = ++numbers ; */

    public static void main(String[] args) {
        Car3 c1, c2, c3;
        c1 = new Car3("s600", "white", 80);
        c2 = new Car3("E500", "blue", 20);
        c3 = new Car3("E300", "gray", 160);
        
        // System.out.println("생성된 자동차 수:" + c1.id);
        // System.out.println("생성된 자동차 수:" + c2.id);
        // System.out.println("생성된 자동차 수:" + c3.id);
        System.out.println(c1.getNumbers());

        // 자바의 수학 관련 라이브러리 클래스는 정적 메서드를 이용
        double d = Math.sqrt(9);
        System.out.println("9의 제곱근: "+d);
    }
}
