
/**
 * Write a description of class MinMax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.Math;
import java.util.Scanner;

public class MinMax{
    public static void main (String[]args){
        Scanner fromKey = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c= 0;
        int smallest = 0;
        int largest = 0;
        
        System.out.print("Enter 1st Integer --> ");
        a = fromKey.nextInt ();
        
        System.out.print("Enter 2nd Integer --> ");
        b = fromKey.nextInt ();
        
        System.out.print("Enter 3rd Integer --> ");
        c = fromKey.nextInt ();
        
        smallest = Math.min(Math.min(a,b),c);
        largest = Math.max(Math.max(a,b),c);
        
        System.out.println();
        
        System.out.println ("Smallest" + " = " + smallest);
        System.out.println ("Largest" + " = " + largest);
        


    }
}
