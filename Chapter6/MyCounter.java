package Chapter6;

public class MyCounter {
    int value = 0;
    void inc(MyCounter ctr) {
        ctr.value = ctr.value + 1;
    }
}
