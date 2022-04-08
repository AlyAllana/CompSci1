import java.util.Scanner;
/**
 * Write a description of class LoopRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BoxWord
{
    public static void main (String[]args)
    {
        Scanner fromKey = new Scanner(System.in);
        System.out.println("Please enter a word:: ");
        String userWord = fromKey.next();
         for(int i = 1; i < userWord.length();  i++) {    
            System.out.println(userWord);
        }
    }
}
