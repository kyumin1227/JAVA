public class Television {
    int channel;
    int volume;
    boolean onOff;
    
    public static void main(String[] args) {
        Television tv = new Television();
        tv.channel = 7;
        tv.volume = 5;
        tv.onOff = true;

        System.out.println("채널은 "+tv.channel+"이고 볼륨은 "+tv.volume+"입니다.");
    }
}