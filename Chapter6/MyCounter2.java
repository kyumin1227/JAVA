package Chapter6;

public class MyCounter2 {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void addOne(int val) {
        val = val+1;
    }

    public static void increase(MyCounter2 cntObj) {
        int v = cntObj.getValue()+1;
        cntObj.setValue(v);
    }

    public static void main(String[] args) {
        // int val = 10;
        // MyCounter2.addOne(val);
        // System.out.println(val);
        MyCounter2 mc = new MyCounter2();
        mc.setValue(10);
        MyCounter2.increase(mc);
        System.out.println(mc.getValue());
    }
}
