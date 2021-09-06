import java.util.Scanner;

public class MyDateTest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        MyDate myDate = new MyDate(11, 11, 1991);
                myDate.set(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
        System.out.println(myDate.getDay() + " " + myDate.getMonth() + " " + myDate.getYear());
        System.out.println(myDate.toString());
        myDate.set(keyboard.nextInt(), keyboard.nextInt(), keyboard.nextInt());
        System.out.println(myDate.getDay() + " " + myDate.getMonth() + " " + myDate.getYear());
        System.out.println(myDate.toString());
    }
}
