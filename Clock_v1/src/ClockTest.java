import java.util.Scanner;

public class ClockTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.

        System.out.print("Hours: ");
        int hour = sc.nextInt();
        sc.nextLine();
        System.out.print("Minutes: ");
        int minute = sc.nextInt();
        sc.nextLine();
        System.out.print("Seconds: ");
        int second = sc.nextInt();
        sc.nextLine();
        System.out.println();

        Clock clock = new Clock(hour, minute, second);

        // 2.

        System.out.println("Getters:");
        System.out.println(clock.getHour());
        System.out.println(clock.getMinute());
        System.out.println(clock.getSecond());
        System.out.println();

        // 3.

        System.out.print("\nTime in seconds: ");
        System.out.println(clock.getTimeInSeconds());
        System.out.println();

        // 4.

        System.out.println(clock);

        // 5.

        clock.set(10, 0, 0);

        // 7.

        System.out.println(clock);

        // 8.

        System.out.print("\nSimple time: ");
        System.out.println(clock.getSimpleTime());
    }

}
