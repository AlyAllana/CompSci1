import java.util.Scanner;

/**
 * Write a description of class GradeReturn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeReturn {
    public static void main (String[]args)
    {
        private numberGrade numbergrade = new numberGrade();
        int input;
        Scanner fromKey = new Scanner(System.in);
        System.out.print("Enter number grade: ");
        input = fromKey.nextInt();
    }
    public int numberGrade (int input)
    {
        
        
        
        if (input <= 90)
        {
        System.out.println("You earned a: A");
    
        }
        
        if (input <= 80)
        {
        System.out.println("You earned a: B");
        }
        
        if (input <= 75)
        {
        System.out.println("You earned a: C");
    
        }
        
        if (input <= 70)
        {
        System.out.println("You earned a: D");
            
        }
        
        if (input < 70)
        {
        System.out.println("You earned a: F");
    
        }
        return input;
    }
}
   

