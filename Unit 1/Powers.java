
/**
 * Write a description of class Powers here.
 *
 * @Aly Allana
 * @January 21, 2022
 */
import java.util.Scanner;
import java.lang.Math;
public class Powers{
    public static void main (String[]args){ 
        Scanner fromKey = new Scanner(System.in);
        //variables:
        int num = 0;
        int square = 0;
        int cube = 0;
        int fourthPower = 0;
        
        //computer asks user to enter integer:
        System.out.print("Please enter an integer--> ");
        num = fromKey.nextInt ();
        
        //mathematical operations
        square = (int)Math.pow(num,2);
        cube = (int)Math.pow(num,3);
        fourthPower = (int)Math.pow(num,4);
        System.out.println();
        
        //computer prints the results
        System.out.println("The Square" + " = " + square);
        System.out.println("The Cube" + " = " + cube); 
        System.out.println("The Fourth Power" + " = " + fourthPower);
    }
}
