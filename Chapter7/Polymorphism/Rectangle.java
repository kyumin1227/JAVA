package Chapter7.Polymorphism;

public class Rectangle extends Shape {
    private int width;
    private int height;

    @Override
    public void draw() {
        System.out.println("Rectangle Draw["+width+","+height+"]");
    }
}
