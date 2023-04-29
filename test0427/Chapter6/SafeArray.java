package test0427.Chapter6;

public class SafeArray {
    private int[] a;
    public int length;

    public SafeArray(int size) {
        a = new int[size];
    }

    public int getArray(int index) {
        if (index <= a.length - 1) {
            return a[index];
        } else {
            System.out.println(index + "는 올바르지 않은 index 값입니다.");
            return 0;
        }
    }

    public void putArray(int index, int value) {
        if (index <= a.length - 1) {
            a[index] = value;
        } else {
            System.out.println(index + "는 올바르지 않은 index 값입니다.");
        }
    }
}
