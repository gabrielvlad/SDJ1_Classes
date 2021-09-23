public class MyDate_V2 {
    private int day, month, year;

    public MyDate_V2(int day, int month, int year) {
        setMyDate(day, month, year);
    }

    public void setMyDate(int day, int month, int year) {
        if (year < 0)
            this.year = year * (-1);
        else
            this.year = year;
        if (month < 1)
            this.month = 1;
        else if (month > 12)
            this.month = 12;
        else
            this.month = month;
        if (day < 1)
            this.day = 1;
        else if (day > numberOfDaysInMonth())
            this.day = numberOfDaysInMonth();
        else
            this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean IsLeapYear() {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        else
            return false;
    }

    public String getMonthName() {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return String.valueOf(month);
        }
    }

    public void stepForwardOneDay() {
        this.day++;
        if (this.day > numberOfDaysInMonth()) {
            this.day = 1;
            this.month++;
            if (this.month > 12) {
                this.month = 1;
                this.year++;
            }
        }
    }

    public int numberOfDaysInMonth() {
        if (month == 2) {
            getMonthName();
            if (IsLeapYear() == true)
                return 29;
            else
                return 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            getMonthName();
            return 30;
        } else {
            getMonthName();
            return 31;
        }
    }

    public boolean isBefore(MyDate_V2 other) {
        if (this.year < other.getYear()) {
            return true;
        } else if (this.year == other.getYear()) {
            if (this.month < other.getMonth()) {
                return true;
            } else if (this.month == other.getMonth()) {
                if (this.day < other.getDay())
                    return true;
                else
                    return false;
            } else
                return false;
        } else
            return false;


    }

    public int yearsBetween(MyDate_V2 other) {
        if (isBefore(other)) {
            if (this.month < other.month)
                return other.year - this.year;
            else if (this.day < other.day && this.month == other.month)
                return other.year - this.year;
            else
                return other.year - this.year - 1;
        } else {
            if (this.month > other.month)
                return this.year - other.year;
            else if (this.day > other.day && this.month == other.month)
                return this.year - other.year;
            else
                return this.year - other.year - 1;
        }
    }

    @Override
    public String toString() {
        if (day < 10 && month < 10)
            return "0" + day + "/0" + month + "/" + year;
        else if (day < 10)
            return "0" + day + "/" + month + "/" + year;
        else if (month < 10)
            return day + "/0" + month + "/" + year;
        else
            return day + "/" + month + "/" + year;
    }
}
