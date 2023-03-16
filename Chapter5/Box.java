package Chapter5;
public class Box {
    int width;
    int length;
    int height;

    public static void main(String[] args) {
        Box firstBox = new Box();
        firstBox.height = 30;
        firstBox.length = 20;
        firstBox.width = 20;
        System.out.println("상자의 가로, 세로, 높이는 "+firstBox.length+", "+firstBox.width+" ,"+firstBox.height+"입니다.");
    }
}
