package DateInterval;

public class DateInterval {
    private int days;
    private MyDate_V6 startDate, endDate;

    public DateInterval(MyDate_V6 startDate, int days) {
        this.days = days;
        this.startDate = startDate;
    }

    public DateInterval(int day, int month, int year, int days) {
        startDate.setMyDate(day, month, year);
        this.days = days;
    }

    public DateInterval(MyDate_V6 startDate, MyDate_V6 endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getDays() {
        return days;
    }

    public MyDate_V6 getStartDate() {
        return startDate;
    }

    public MyDate_V6 getEndDate() {
        return endDate;
    }

    public boolean overlap(DateInterval otherDateInterval) {
        if(startDate.isBefore(otherDateInterval.endDate) || startDate.isBefore(otherDateInterval.endDate)) {
            return true;
        }
        else if(otherDateInterval.startDate.isBefore(startDate) && endDate.isBefore(otherDateInterval.endDate))
            return true;
        else return startDate.equals(otherDateInterval.startDate) || startDate.equals(otherDateInterval.endDate) || endDate.equals(otherDateInterval.startDate) || endDate.equals(otherDateInterval.endDate);
    }

    public boolean equals(Object obj)
    {
        if(!(obj instanceof DateInterval))
            return false;
        else {
            DateInterval other = (DateInterval)obj;
            return startDate.equals(other.startDate) && endDate.equals(other.endDate) && days== other.days;
        }
    }

    @Override
    public String toString()
    {
        return days+" "+ startDate +" "+ endDate;
    }
}
