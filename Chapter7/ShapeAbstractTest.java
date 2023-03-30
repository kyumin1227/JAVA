package Chapter7;

public class ShapeAbstractTest {
    public static void main(String[] args) {
        // 부모 클래스는 자식 클래스를 품는것이 가능
        ShapeAbstract r = new RectangleAbstract();
        // RectangleAbstract r = new RectangleAbstract();
        TriangleAbstract t = new TriangleAbstract();
        CircleAbstract c = new CircleAbstract();
        
        r.draw();
        r.move(10, 20);
        t.draw();
        t.move(20, 30);
        c.draw();
        c.move(30, 40);
    }
}
