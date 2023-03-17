package Chapter6;

public class Box2 {
    private int width, length, height;
    // private int volume;

    public Box2(int w, int len, int h) {
        width = w;
        length = len;
        height = h;

        // volume = width*length*height;
    }

    // getVolume 메소드는 내부적으로만 사용하기 때문에 private로 만듦
    public int getVolume() {
        return width*length*height;
    }

    public static Box2 whoIsLargeBox(Box2 box1, Box2 box2) {
        if (box1.getVolume() > box2.getVolume()) {
            return box1;
        }
        return box2;
    }

    public static void main(String[] args) {
        Box2 b1 = new Box2(10, 20, 50);
        Box2 b2 = new Box2(10, 30, 30);
        System.out.println("첫 번째 박스의 부피: "+b1.getVolume());
        System.out.println("두 번째 박스의 부피: "+b2.getVolume());

        Box2 largerBox = Box2.whoIsLargeBox(b1, b2);
        System.out.println("더 큰 박스의 부피: "+largerBox.getVolume());
    }
}
