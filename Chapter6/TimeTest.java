package Chapter6;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        System.out.println("기본 생성자 호출 후 시간: "+t.toString());
        Time t2 = new Time(13, 27, 6);
        System.out.println("두번째 생성자 호출 후 시간: "+t2.toString());
        Time t3 = new Time(123, 456, 789);
        System.out.println("올바르지 않은 시간 설정 후 시간: "+t3.toString());
    }
}
