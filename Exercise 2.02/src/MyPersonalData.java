import java.util.Scanner;

public class MyPersonalData
{
  public static void main (String[] args)
  {
    int age;
    String name;
    String address;

    // Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    //Get the user age:
    System.out.print("What is your age? ");
    age = keyboard.nextInt();
    keyboard.nextLine();

    //Get the user name:
    System.out.print("What is your name? ");
    name = keyboard.nextLine();


    //Get the user address:
    System.out.print("What is your address? ");
    address = keyboard.nextLine();


    //Display the resulting information:
    System.out.println("User age is " + age + " and his name is " + name + "and his address is " + address);

  }
}
