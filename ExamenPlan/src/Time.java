public class Time {
  private int hour, minute, second;

  public Time(int hour, int minute, int second) {
    this.hour =  Math.abs(hour);
    this.minute = Math.abs(minute);
    this.second = Math.abs(second);
  }

  public Time(int totalTimeInSeconds) {
    second = totalTimeInSeconds % 60;
    totalTimeInSeconds /= 60;
    minute = totalTimeInSeconds % 60;
    hour = totalTimeInSeconds / 60;
  }

  public int convertToSeconds() {
    return (hour * 60 + minute) * 60;
  }

  public boolean isBefore(Time time2){
    if (hour < time2.hour)
      return true;
    else if (hour == time2.hour && minute < time2.minute)
      return true;
    else
      return hour == time2.hour && minute == time2.minute && second <= time2.second;
  }

  public Time timeUntil(Time time2) {
    if(this.isBefore(time2)) {
      return new Time(time2.hour-hour,time2.minute-minute, time2.second-second);
    }
    throw new IllegalArgumentException("The date argument is before the time already");
  }

  public Time copy() {
    return new Time(hour,minute,second);
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Time))
      return false;
    else {
      Time other = (Time) obj;
      return other.hour == hour && other.minute == minute && other.second == second;
    }
  }

  @Override
  public String toString() {
    String aux = "";
    if(hour<10)
      aux+="0"+hour+":";
    else
      aux+=hour+":";
    if(minute<10)
      aux+="0"+minute+":";
    else
      aux+=minute+":";
    if(second<10)
      aux+="0"+second;
    else
      aux+=second;
    return aux;
  }
}

