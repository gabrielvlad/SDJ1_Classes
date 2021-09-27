import java.util.Scanner;
public class MyPersonalData
{
    public static void main(String[] args)
    {
        int age;
        String name;
        String adress;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = keyboard.nextLine();

        System.out.print("What is your adress? ");
        adress = keyboard.nextLine();

        System.out.print("What is your age? ");
        age = keyboard.nextInt();



        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("You live in " + adress);
    }
}
