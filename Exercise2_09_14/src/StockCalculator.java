import java.util.Scanner;

public class StockCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of shares: ");
        double sharesAmount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter price per share: ");
        double sharePrice = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter commission fee in %: ");
        double commissionFee = sc.nextDouble()/100;
        sc.nextLine();

        double totalStockPrice = sharesAmount * sharePrice;

        System.out.println("Price paid for stock: " + totalStockPrice);
        System.out.println("Commission: " + (commissionFee * totalStockPrice));
        System.out.println("Total price with commission: " + (1+commissionFee) * totalStockPrice);
    }

}
