public class Clock {

    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        set(hour, minute, second);
    }

    public void set(int hour, int minute, int second) {
        this.hour = (hour > 23) ? hour % 24 : hour;
        this.minute = (minute > 59) ? minute % 60 : minute;
        this.second = (second > 59) ? second % 60 : second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public int getTimeInSeconds(){
        return 3600*hour + 60*minute + second;
    }

    public String getSimpleTime(){
        return hour + ":" + minute;
    }

    @Override
    public String toString() {
        return ((hour<=9)?"0"+hour:hour) + ":" + ((minute<=9)?"0"+minute:minute) + ":" + ((second<=9)?"0"+second:second);
    }
}
