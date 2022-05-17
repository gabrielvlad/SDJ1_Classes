import java.io.File;
import java.util.Scanner;

public class EmailTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter e-mail user: ");
        String user = sc.nextLine();
        System.out.print("Enter e-mail host: ");
        String host = sc.nextLine();
        System.out.print("Enter e-mail domain: ");
        String domain = sc.nextLine();

        Email email = new Email(user, host, domain);
        System.out.println("User: " + email.getUser());
        System.out.println("Host: " + email.getHost());
        System.out.println("Domain: " + email.getDomain());
        System.out.println("E-mail: " + email);

    }

}
