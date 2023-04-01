package Chapter7.Polymorphism;

public class Circle extends Shape {
    private int radius;

    @Override
    public void draw() {
        System.out.println("Circle Draw["+radius+"]");
    }
}
