import java.lang.Math;
import java.util.Scanner;
public class DistanceFormula
{
    public static void main (String[]args)
    {
        Scanner fromKey = new Scanner(System.in);
        int xdistanceA = 0;
        int ydistanceA = 0;
        int xdistanceB = 0;
        int ydistanceB = 0;
        int calculationA = (int)Math.sqrt((Math.pow((xdistanceA - 0),2)) + (Math.pow((ydistanceA - 0),2)));
        int calculationB = (int)Math.sqrt((Math.pow((xdistanceB - 0),2)) + (Math.pow((ydistanceB - 0),2)));
        
        System.out.print("Enter truck A's X coordinate :: ");
        xdistanceA = fromKey.nextInt ();
        System.out.print("Enter truck A's Y coordinate :: ");
        ydistanceA = fromKey.nextInt ();
        System.out.print("Enter truck B's X coordinate :: ");
        xdistanceB = fromKey.nextInt ();
        System.out.print("Enter truck B's Y coordinate :: ");
        ydistanceB = fromKey.nextInt ();
        calculationA = (int)Math.sqrt(((Math.pow((xdistanceA - 0),2))) + (Math.pow((ydistanceA - 0),2)));
        calculationB = (int)Math.sqrt(((Math.pow((xdistanceB - 0),2))) + (Math.pow((ydistanceB - 0),2)));
        System.out.println();
        if(calculationA > calculationB)
        {
            System.out.println("B is closer to (0,0).");
            
        }
        if(calculationA < calculationB)
        {
               System.out.println("A is closer to (0,0).");
                
        }
        }
    }

