package test0427.Chapter6;

import javax.print.attribute.standard.RequestingUserName;

public class Box {
    private int width;
    private int length;
    private int height;

    Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public boolean isSameBox(Box obj) {
        return (width == obj.width && length == obj.length && height == obj.height) ? true : false;
    }
}
