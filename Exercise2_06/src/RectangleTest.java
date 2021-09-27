import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        double length;
        double width;


        Scanner keyboard = new Scanner(System.in);
        length = keyboard.nextDouble();
        width = keyboard.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("length " + rectangle.getLength());
        System.out.println("width " + rectangle.getWidth());
        System.out.println("area " + rectangle.getArea());


    }
}
