import java.util.Scanner;

public class ClockTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Clock clock = new Clock(12, 12, 45);
        System.out.println(clock.getHour());
        System.out.println(clock.getMinute());
        System.out.println(clock.getSecond());
        System.out.println(clock.getTimeInSeconds());
        System.out.println(clock.toString());
        clock.set(11, 11, 35);
        System.out.println(clock.getHour());
        System.out.println(clock.getMinute());
        System.out.println(clock.getSecond());
        System.out.println(clock.getTimeInSeconds());
        System.out.println(clock.toString());
        System.out.println(clock.getSimpleTime());
    }
}
