import java.util.Scanner;

public class NimGame
{
  static Scanner keyboard = new Scanner(System.in);
  static int[] piles = {3, 5, 8};
  static byte currentPlayer = 1;

  public static void printPiles(int[] piles)
  {
    for (int i = 0; i < 3; i++)
    {
      for (int j = 0; j < piles[i]; j++)
      {
        System.out.print("|");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {

    while (!isOver())
    {

      printPiles(piles);
      System.out.println("Please player "+ currentPlayer +" choose a pile?");
      int pileIndex = keyboard.nextInt()-1;

      if(pileIndex <0 || pileIndex >2)
        continue;

      System.out.println("Please enter the number of sticks");
      int sticksIndex = keyboard.nextInt();

      if(sticksIndex <= piles[pileIndex] && sticksIndex >0){
        piles[pileIndex] = piles[pileIndex] - sticksIndex;

        changePlayer();

      }
    }

    System.out.println("Player " + currentPlayer + " Won");
  }

  public static void changePlayer(){
    if (currentPlayer == 1)
      currentPlayer = 2;
    else
      currentPlayer = 1;
  }

  public static boolean isOver(){
    for (int i: piles)
    {
      if (i != 0)
        return false;
    }
    return true;
  }
}
