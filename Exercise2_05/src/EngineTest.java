import rentalcompany.model.*;
import java.util.Scanner;

public class EngineTest
{
    public static void main(String[] args)
    {
        String type;
        int HorsePower;
        int Volume;


        boolean IsDiesel;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a car type: ");
        type = keyboard.nextLine();
        System.out.print("Enter how much horse power the car has: ");
        HorsePower = keyboard.nextInt();
        System.out.print("What is you car's Volume? ");
        Volume = keyboard.nextInt();
        System.out.print("Is it a diesel car? (true or false) ");
        IsDiesel = keyboard.nextBoolean();
        if(IsDiesel == true)
        {
            Engine engine1 = new Engine(type, HorsePower, Volume, true);System.out.println("Engine 1: "+ engine1.toString());
        }
        else
        {
            Engine engine2 = new Engine(type, HorsePower, Volume, false);System.out.println("Engine 2: " + engine2.toString());
        }
      /**  System.out.println("Type = " + type);
        System.out.println("HorsePower = " + HorsePower);
        System.out.println("Volume in m^3 = " + Volume);
        System.out.println("IsDiesel = " + IsDiesel);
    */
    }
}
