package Chapter6;

public class Box {
    private int width;
    private int length;
    private int height;
    private int volume;

    Box(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }

    public int getVolume() {
        volume = width*length*height;
        return volume;
    }
}
