package test0427.Chapter6;

public class BoxTest {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        Box b2 = new Box(10, 20, 30);

        System.out.println("obj1 == obj2 : " + b1.isSameBox(b2));
    }
}
