public class Television {
    int channel;
    int volume;
    boolean onOff;

    void print() {
        System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
    }
    
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.channel = 7;
        myTv.volume = 5;
        myTv.onOff = true;
        myTv.print();

        Television yourTv = new Television();
        yourTv.channel = 13;
        yourTv.volume = 20;
        yourTv.onOff = false;
        yourTv.print();
    }
}