// This program demonstrates the double data type.
import rentalcompany.model.*;
import java.util.Scanner;

public class DateTest

{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

  //Input user data:
  System.out.println("What is the day?");
  int day = keyboard.nextInt();
  System.out.println("What is the month?");
  int month = keyboard.nextInt();
  System.out.println("What is the year?");
  int year = keyboard.nextInt();

  MyDate date1 = new MyDate(day, month, year);

  System.out.println("The dates are: " + date1);
  date1.stepForward(17);

  //Display the resulting information:
  System.out.println("The date stept forward 17 days is: " + date1);

  }
}
