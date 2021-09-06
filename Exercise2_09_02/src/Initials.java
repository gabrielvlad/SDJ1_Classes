import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your middle name: ");
        String middleName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        char firstNameChar = firstName.charAt(0);
        char middleNameChar = middleName.charAt(0);
        char lastNameChar = lastName.charAt(0);

        System.out.println("Your initials are " + firstNameChar + "." + middleNameChar + "." + lastNameChar + ".");


    }

}
