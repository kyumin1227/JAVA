package test0427.Chapter6;

public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray sa = new SafeArray(3);

        sa.putArray(0, 123);
        sa.putArray(1, 532);

        System.out.println(sa.getArray(2));
        System.out.println(sa.getArray(1));

        sa.putArray(5, 214);
    }
}
