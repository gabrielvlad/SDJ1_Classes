import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {

        // 1.

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        char gender = sc.nextLine().charAt(0);

        Person person = new Person(name, age, gender);

        // 2.

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());

        // 3.

        System.out.println(person);

        // 4.

        person.setName("Tomas");
    }

}
