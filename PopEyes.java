/**
 * 
 *
 * @Aly Allana
 * @January 24, 2022
 */
import java.util.Scanner;
import java.lang.Math;
public class PopEyes{
    public static final int MAX_CAPACITY = 127;
        public static void main (String[]args){
            Scanner fromKey = new Scanner(System.in);
            int customers = 0;
            int minutes = 0; 
            int groups = 0; 
            int totalHours = 0;
            int totalMinutes = 0;
            int leftOver = 0;
            
           
            
            
            
            System.out.println("=======> Popeyes Time Estimator <=======");
            System.out.print("Enter number of expected customers: ");
            customers = fromKey.nextInt ();
            groups = customers/127;
            leftOver = customers%127;
            minutes = groups * 25;
            totalHours = minutes/60;
            totalMinutes = minutes % 60;
            
            if( leftOver > 0) {System.out.println("Leftover customers: " + leftOver); }
            
            
            
            
            System.out.println("Total Hours: " + totalHours +  " Total Minutes: " + totalMinutes);
            
            fromKey.close();

        }   
}
