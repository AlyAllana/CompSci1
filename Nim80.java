import java.util.Scanner;
/**
 * Write a description of class Nim80 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim80
{
    public static void main (String[]args)
    {
        Scanner fromKey = new Scanner(System.in);
        
        //Variables
        int pileA = 3;
        int pileB = 3;
        int pileC = 3;
        int taken = 0;
        boolean keepPlaying = true;
        
        System.out.println("--==* Nim *==-");
        while (keepPlaying = true)
        {
            System.out.println();
            System.out.println("A:  " + pileA  + "      B:    " + pileB + "     C:      " + pileC);
            System.out.print(" Choose a pile: ");
            String word = fromKey.next();
            System.out.print(" How many will you take: ");
            taken = fromKey.nextInt();
            System.out.println();
            if (word.equals ("A")) 
            {
                pileA = (pileA - taken);
            }
            else if (word.equals ("B")) 
            {
                pileB = (pileB - taken);
            }
            else if (word.equals ("C")) 
            {
                pileC = (pileC - taken);
            }
            if (pileA == 0 && pileB == 0 && pileC == 0)
            {
                System.out.println("All the piles are empty! Well done!");
                break;
            
            }
        }
    }
}
