package Chapter5;
public class Television {
    int channel;
    int volume;
    boolean onOff;

    void print() {
        System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
    }
    int getChannel() {
        return channel;
    }
    void setChannel(int ch) {
        channel = ch;
    }
    
    public static void main(String[] args) {
        Television myTv = new Television();
        myTv.setChannel(27);
        int ch = myTv.getChannel();
        System.out.println("채널이 "+ch+ "번으로 변경되었습니다.");
        // myTv.channel = 7;
        // myTv.volume = 5;
        // myTv.onOff = true;
        // myTv.print();
        // int myCh = myTv.getChannel();
        // System.out.println("현재 채널은 " +myCh+"입니다.");

        // Television yourTv = new Television();
        // yourTv.channel = 13;
        // yourTv.volume = 20;
        // yourTv.onOff = false;
        // yourTv.print();
        // int yourCh = yourTv.getChannel();
        // System.out.println("현재 채널은 " +yourCh+"입니다.");
    }
}