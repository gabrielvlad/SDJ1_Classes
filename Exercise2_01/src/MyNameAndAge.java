import java.util.Scanner;
public class MyNameAndAge
{
    public static void main(String[] args)
    {
        String name;
        int age;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        System.out.print("What is your age? ");
        age = keyboard.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
    }
}
