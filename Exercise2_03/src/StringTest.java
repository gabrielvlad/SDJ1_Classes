import java.util.Scanner;
public class StringTest
{
    public static void main(String[] args)
    {
        String line;
        int lineLength;
        char firstCharacter;
        char lastCharacter;
        String UpperCharacters;
        String LowerCharacters;
        String First5;
        String Last5;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Write a line of text: ");
        line = keyboard.nextLine();

         lineLength = line.length();
        System.out.println(lineLength);
         firstCharacter = line.charAt(0);
        System.out.println(firstCharacter);
         lastCharacter = line.charAt(lineLength-1);
        System.out.println(lastCharacter);
         UpperCharacters = line.toUpperCase();
        System.out.println(UpperCharacters);
         LowerCharacters = line.toLowerCase();
        System.out.println(LowerCharacters);
         First5 = line.substring(5);
        System.out.println(First5);
         Last5 = line.substring(lineLength-5);
        System.out.println(Last5);
         boolean Ifends = line.endsWith("abc");
        System.out.println(Ifends);
         int indexA = line.indexOf("a");
        System.out.println(indexA);
         int indexB = line.indexOf("b");
        System.out.println(indexB);
         int indexX = line.indexOf("x");
        System.out.println(indexX);
         String Replacer = line.replace('a', 'x');
        System.out.println(Replacer);














    }
}
