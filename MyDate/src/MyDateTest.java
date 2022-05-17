import java.util.Scanner;

public class MyDateTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1.

        System.out.print("Day: ");
        int day = sc.nextInt();
        sc.nextLine();
        System.out.print("Month: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        sc.nextLine();
        System.out.println();

        MyDate date = new MyDate(day, month, year);

        // 2.

        System.out.println("Getters:");
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println();

        // 3.

        System.out.println(date);

        // 4.

        date.set(28,9,2001);

        // 5.

        System.out.println("Getters:");
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
        System.out.println();

        // 6.

        System.out.println(date);

    }

}
