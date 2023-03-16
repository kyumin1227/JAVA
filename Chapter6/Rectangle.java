package Chapter6;

public class Rectangle {
    private int x, y, width, height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public void printRectangle() {
        System.out.println("x : "+x+" y : "+y+" width : "+width+" height : "+height);
    }
}
