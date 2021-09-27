public class Clock {
    private int hour,minute,second;
    public Clock(int hour,int minute,int second)
    {
        setClock(hour,minute,second);
    }
    public void setClock(int hour,int minute,int second)
    {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }
    public int getSecond()
    {
        return second;
    }
    public int getTimeInSeconds()
    {
        return (60*hour+minute)*60+second;
    }
    public String getSimpleTime()
    {
        return hour+":"+minute;
    }
    @Override
    public String toString()
    {
        return hour+" "+minute+" "+second;
    }
}
