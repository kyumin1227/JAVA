package Chapter7.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Shape s = new Shape();
        // s.draw();
        shapes[0] = s;

        s = new Rectangle();
        // s.draw();
        shapes[1] = s;

        s = new Circle();
        // s.draw();
        shapes[2] = s;

        s = new Triangle();
        // s.draw();
        shapes[3] = s;

        s = new polygon();
        shapes[4] = s;

        drawShapes(shapes);
    }

    public static void drawShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            s.draw();
        }
    }
}
