import java.util.Scanner;

public class MyDateTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyDate_V6 myDate1 = new MyDate_V6(scan.nextInt(), scan.nextInt(), scan.nextInt());
        MyDate_V6 myDate2 = new MyDate_V6(10,"October",2002);
        if(!myDate1.isBefore(myDate2)){
            System.out.println("The date is before today");
        }
        else
            System.out.println("The date is not before today");
        myDate1.stepForwardDays(45);
        System.out.println(myDate1.getDay()+" "+myDate1.getMonthName()+" "+myDate1.getYear());
        System.out.println(myDate2.getDay()+" "+myDate2.getMonth()+" "+myDate2.getYear());
        System.out.println(myDate1.getAstroElement());
    }
}
