package Chapter7;

public class Rectangle_329 extends Shape_329 {
    private int width;
    private int height;

    public Rectangle_329(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
        System.out.println("Rectangle()");
    }
}
