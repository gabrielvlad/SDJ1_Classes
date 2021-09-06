import java.util.Scanner;

public class Tax {

    private static final double DENMARK_TAX = 0.25;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double tax = DENMARK_TAX * price;
        System.out.println("The tax is: " + tax + "" +
                "\n" + "The price with tax is: " + (price+tax));

    }

}
