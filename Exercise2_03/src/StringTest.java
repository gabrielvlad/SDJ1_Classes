import java.util.Scanner;

public class StringTest
{
  public static void main (String[] args)
  {
    // Create a Scanner object to read input.
    Scanner keyboard = new Scanner(System.in);

    //input the value
    String box = keyboard.nextLine();

    //Display results:
    System.out.println(box.length());
    System.out.println(box.charAt(0));
    System.out.println(box.toUpperCase());
    System.out.println(box.toLowerCase());
    System.out.println(box.substring(5));
    System.out.println(box.substring(box.length()-4));
    System.out.println(box.indexOf('a'));

  }
}
