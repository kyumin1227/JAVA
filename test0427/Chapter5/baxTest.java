package test0427.Chapter5;

public class baxTest {
    public static void main(String[] args) {
        Box b = new Box();
        // Box b = new Box(20, 20, 30);

        // b.setWidth(20);
        // b.setLength(20);
        // b.setHeight(30);

        System.out.println("가로 " + b.getWidth() + " 세로 " + b.getLength() + " 높이 " + b.getHeight());
    }
}
