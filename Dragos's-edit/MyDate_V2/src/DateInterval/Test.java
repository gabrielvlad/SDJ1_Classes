package DateInterval;

public class Test {
    public static void main(String[] args) {
        MyDate_V6 myDateV6 = new MyDate_V6(10,10,2000);
        MyDate_V6 myDateV61 = new MyDate_V6(20,10,2021);
        MyDate_V6 myDateV62 = new MyDate_V6(15,10,2015);
        MyDate_V6 myDateV63 = new MyDate_V6(15,10,1823);
        DateInterval interval = new DateInterval(myDateV6,myDateV61);
        DateInterval interval1 = new DateInterval(myDateV63,myDateV62);
        System.out.println(interval.overlap(interval1));
    }
}
