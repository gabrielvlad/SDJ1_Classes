import java.util.Scanner;


import rentalcompany.model.*;

public class DateTest {
    public static void main(String[] args) {
        int day;
        int month;
        int year;
        int stepForwardDays;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a day ");
        day = keyboard.nextInt();
        System.out.print("Enter a month ");
        month = keyboard.nextInt();
        System.out.println("Enter a year ");
        year = keyboard.nextInt();
        MyDate date1 = new MyDate(day, month, year);
        System.out.println(date1.toString());
        System.out.println("Type how many days you want to step forward: ");
        stepForwardDays = keyboard.nextInt();
        System.out.println("You stepped to the date: ");
        MyDate date2 = new MyDate(day + stepForwardDays, month, year);
        System.out.println(date2.toString());


    }
}
