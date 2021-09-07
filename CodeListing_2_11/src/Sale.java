import java.sql.SQLOutput;

//This progeram demonstrates the double data type
public class Sale
{
    public static void main(String[] args)
    {
        //double is used so the program would calculate numbers after coma
        double price, tax, total;

        price = 29.75;
        tax = 1.76;
        total = 31.61;
        System.out.println("The price of the item " + "is " + price);
        System.out.println("The tax is " + tax);
        System.out.println("The total is " + total);
    }
}
