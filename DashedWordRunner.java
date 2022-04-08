/**
 * DashedWord Runner
 *
 * @author Aly Allana
 * @version Unit 4.0
 */
import java.util.Scanner;

public class DashedWordRunner
{
    public static void main (String[] args)
    {
        Scanner fromKey = new Scanner (System.in);
        DashedWord input = new DashedWord();
        
        System.out.print("Enter a string --> ");
        String word = fromKey.nextLine();
        System.out.print("\n");
        
        // Void Method Call
        input.dashVoid(word);
        
        // Return Method Call
        System.out.println("Dashed word :: " + input.dashReturn(word));
    }
}