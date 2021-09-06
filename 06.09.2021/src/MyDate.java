public class MyDate {
    private int day,month,year;
    public MyDate(int day,int month,int year)
    {
        setMyDate(day,month,year);
    }
    public void setMyDate(int day,int month,int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay()
    {
        return day;
    }
    public int getMonth()
    {
        return month;
    }
    public int getYear()
    {
        return year;
    }
    @Override
    public String toString()
    {
     return day+"."+month+"."+year;
    }
}
