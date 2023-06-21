package test0621.chapter9;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 30);
        Rectangle r2 = new Rectangle(20, 15);

        int result = r1.compareTo(r2);
        if (result == 1) {
            System.out.println(r1 + "이 더 큽니다.");
        } else if (result == 0) {
            System.out.println("값이 같습니다.");
        } else {
            System.out.println(r2 + "이 더 큽니다.");
        }

        System.out.println(r1.findLargest(r1, r2));
        System.out.println(r1.isEqual(r1, r2));
    }
}
