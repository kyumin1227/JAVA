package Chapter6;

import java.text.DecimalFormat;

public class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        if(hour>=0 && hour<24)
            this.hour = hour;
        if(minute>=0 && minute<60)
            this.minute = minute;
        if(second>=0 && second<60)
            this.second = second;
    }

    Time() {
        this(0, 0, 0);
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("00");
        
        return (df.format(hour)+":"+df.format(minute)+":"+df.format(second));
    }
}
