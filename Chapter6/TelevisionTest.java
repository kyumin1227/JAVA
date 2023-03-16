package Chapter6;
public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(6, 9, true);
        // myTv.channel = 6;
        // myTv.volume = 9;
        // myTv.onOff = true;
        myTv.print();

        Television myTv2 = new Television(2, 13, false);
        // myTv2.channel = 2;
        // myTv2.volume = 13;
        // myTv2.onOff = false;
        myTv2.print();
        
    }
}