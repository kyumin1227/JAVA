package test0427.Chapter6;

public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public String toString() {
        return "Circle [radius=" + radius + ", center=" + center + "]";
    }
}
