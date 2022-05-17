import java.util.Scanner;

public class AddressTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your town: ");
        String town = sc.nextLine();
        System.out.print("Enter your street: ");
        String street = sc.nextLine();
        System.out.print("Enter your street number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your letter: ");
        char letter = sc.nextLine().charAt(0);
        System.out.print("Enter your floor: ");
        int floor = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your door: ");
        String door = sc.nextLine();

        Address address = new Address(town, street, number, letter, floor, door);

        /*

        System.out.println(address.getTown());
        System.out.println(address.getStreet());
        System.out.println(address.getNumber());
        System.out.println(address.getLetter());
        System.out.println(address.getFloor());
        System.out.println(address.getDoor());

        //System.out.print("Full number: " + address.getFullNumber());
        //System.out.print("Full address: " + address.getFullAddress());\

         */

        System.out.println(address);

    }

}
