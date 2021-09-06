// This program has literals and a variable.
import java.util.Scanner;

public class MyNameAndAge
{
  public static void main(String[] args)
  {
    int age;
    String name;

    // Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    //Get the user age:
    System.out.print("What is your age? ");
    age = keyboard.nextInt();
    keyboard.nextLine();

    //Get the user name:
    System.out.print("What is your name? ");
    name = keyboard.nextLine();

    //Display the resulting information:
    System.out.println("User age is " + age + " and his name is " + name);

  }
}


