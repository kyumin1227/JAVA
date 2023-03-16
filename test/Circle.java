package test;

public class Circle {
    private Point p;
    private int radius;

    public Circle(Point p, int radius) {
        this.p = p;
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return "기준점:"+p+"반지름:"+radius;
    }

    public static void main(String[] args) {
        Point p = new Point(10, 15);
        Circle c = new Circle(p, 10);

        System.out.println(p);                              //주소값 출력(object로 부터 상속받은 toString)
        System.out.println(c);
        System.out.println(p.toString());
        System.out.println(c.toString());
    }
}
