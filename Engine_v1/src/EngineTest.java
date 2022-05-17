import java.util.Scanner;

public class EngineTest {

    public static void main(String[] args) {

        /*

        String type = "8-cylinder, twin-turbo";
        int horsepower = 591;
        int volume = 3996;
        boolean isDiesel = false;

        Engine engine1 = new Engine(type, horsepower, volume, isDiesel);
        System.out.println("Engine specs: " + engine1);

        Engine engine2 = new Engine("6-cylinder 3.0L /w mild hybrid drive", 362, 3000, false);
        System.out.println("Engine specs: " + engine2);

        */

        Scanner sc = new Scanner(System.in);

        Driv

        System.out.print("Enter engine type: ");
        String type = sc.nextLine();
        System.out.print("Enter engine horsepower: ");
        int horsepower = sc.nextInt();
        System.out.print("Enter engine volume in cm3: ");
        int volume = sc.nextInt();

        Engine engine3 = new Engine(type, horsepower, volume, false);
        System.out.println(engine3);

    }

}
