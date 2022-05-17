import java.util.Scanner;

public class NameTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        Name name = new Name(firstName, lastName);

        System.out.println("First name: " + name.getFirstName());
        System.out.println("Last name: " + name.getLastName());
        System.out.println("Full name: " + name.getFullName());
        System.out.println("Formal name: " + name.getFormalName());

    }

}
