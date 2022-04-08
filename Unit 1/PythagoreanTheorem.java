/**
 * Write a description of class PythagoreanTheorem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.lang.Math;
public class PythagoreanTheorem{
    public static void main (String[]args){
        Scanner fromKey = new Scanner(System.in);
        double sideA = 0;
        double sideB = 0;
        double hypotenuseC = 0;
        
        System.out.print ("Enter side A: "); 
        sideA = fromKey.nextDouble ();
        
        System.out.print ("Enter side B: "); 
        sideB = fromKey.nextDouble ();
        
        hypotenuseC = Math.pow (sideA, 2) + Math.pow (sideB, 2);
        
        hypotenuseC = Math.sqrt (hypotenuseC);
        
        hypotenuseC = Math.round (hypotenuseC);
    
        System.out.print ("The length of hypotenuse C:  " + (int)hypotenuseC);
        
        
    
        
        
        

    }

}

