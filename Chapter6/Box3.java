package Chapter6;

public class Box3 {
    int width;
    int length;
    int height;

    public Box3(int w, int l, int h) {
        width = w;
        length = l;
        height = h;
    }
    
    public boolean isSameBox (Box3 box1, Box3 box2) {
        if(box1.width == box2.width && box1.length == box2.length && box1.height == box2.height)
            return true;
        else
            return false;
    }
}
