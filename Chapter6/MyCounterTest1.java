package Chapter6;

public class MyCounterTest1 {
    public static void main(String[] args) {
        MyCounter obj = new MyCounter();
        
        System.out.println("obj.value = "+obj.value);
        obj.inc(obj);
        System.out.println("obj.value = "+obj.value);
    }
}
