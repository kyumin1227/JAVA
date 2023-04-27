package test0427.Chapter5;

import java.util.HexFormat;

public class Box {
    private int width;
    private int length;
    private int height;

    {
        width = 10;
        length = 10;
        height = 10;
    }

    public Box() {
        // this(10, 10, 10);
    }

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}
