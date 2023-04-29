package test0427.Chapter6;

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time();
        System.out.println(t1);
        Time t2 = new Time(13, 27, 6);
        System.out.println(t2);
        Time t3 = new Time(1234, -51, 53245643);
        System.out.println(t3);
    }
}
