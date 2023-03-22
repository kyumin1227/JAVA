package Chapter6;

public class Box3Test {
    public static void main(String[] args) {
        Box3 obj = new Box3(10, 20, 30);
        Box3 obj2 = new Box3(10, 20, 30);

        System.out.println("obj == obj2 : "+obj.isSameBox(obj, obj2));
    }
}
