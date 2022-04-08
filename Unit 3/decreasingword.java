import java.util.Scanner;
/**
 * Write a description of class LoopRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class decreasingword 
{
    public static void main (String[]args)
    {
        Scanner fromKey = new Scanner(System.in);
        String userWord = "";
        int i = 0;
        System.out.println("Please enter a word:: ");
        userWord = fromKey.next();
        int userLength = userWord.length();
       
        
        
         for(i = 1; i <= userWord.length(); i++ ) {           
             userLength = (userWord.length()- i);
                           
             System.out.println(userWord.substring(0, userLength));
            
        }
    }
}