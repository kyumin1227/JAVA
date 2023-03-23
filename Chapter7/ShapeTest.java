package Chapter7;

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3, 10, 20);
        Rectangle r2 = new Rectangle(8, 9, 10, 20);
        
        r1.print();
        r1.draw();
        r2.print();
        r2.draw();
    }
}
