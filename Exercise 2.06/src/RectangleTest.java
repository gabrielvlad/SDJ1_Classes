// This is stolen from Dragos.

import java.util.Scanner;

  public class RectangleTest {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      double L = scan.nextDouble();
      double W = scan.nextDouble();
      Rentagle square = new Rentagle(L,W);
      System.out.println(square.getLength());
      System.out.println(square.getWidth());
      System.out.println(square.getArea());
    }
  }

