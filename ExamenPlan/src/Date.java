import java.time.LocalDateTime;

public class Date {
  private int day, month, year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public boolean isBefore(Date date) {
    if (year < date.year)
      return true;
    else if (year == date.year && month < date.month)
      return true;
    return year == date.year && month == date.month && day < date.day;
  }

  private boolean isLeapYear() {
    return year % 4 == 0 && year % 100 != 0;
  }

  private int daysInMonth() {
    switch (month) {
      case 4, 6, 9, 11 -> {
        return 30;
      }
      case 2 -> {
        if (isLeapYear())
          return 29;
        return 28;
      }
      default -> {
        return 31;
      }
    }
  }

  private void nextDay() {
    day++;
    if (day > daysInMonth()) {
      month++;
      day = 1;
      if (month > 12) {
        year++;
        month = 1;
      }
    }
  }

  public int numberOfDaysUntil(Date date2) {
    int counter = 0;
    if(date2.isBefore(this))
      throw new IllegalArgumentException("The date is before the date that you're comparing to");
    while (!date2.equals(this)) {
      counter++;
      nextDay();
    }
    return counter;
  }

  public static Date today() {
    LocalDateTime now = LocalDateTime.now();
    return new Date(now.getDayOfMonth(), now.getMonthValue(), now.getYear());
  }

  public Date copy() {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj) {
    if (!(obj instanceof Date))
      return false;
    else {
      Date other = (Date) obj;
      return other.day == day && other.month == month && other.year == year;
    }
  }

  @Override
  public String toString() {
    return day+"/"+month+"/"+year;
  }
}
