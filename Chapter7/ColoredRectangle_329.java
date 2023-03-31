package Chapter7;

public class ColoredRectangle_329 extends Rectangle_329 {
    private String color;

    public ColoredRectangle_329(int x, int y, int width, int height, String color) {
        super(x, y, width, height);
        this.color = color;
        System.out.println("ColoredRectangle()");
    }
    public String colorChange(String color) {
        this.color = color;
        return color;
    }
}
