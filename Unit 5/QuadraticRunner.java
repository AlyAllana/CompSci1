import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
public class QuadraticRunner
{
    public static void main( String[] args )
   {
       //add test cases
       Scanner scan = new Scanner(System.in);
       Quadratic test = new Quadratic();
       
       System.out.print("Enter a :: ");
       int a = scan.nextInt();
       System.out.print("Enter b :: ");
       int b = scan.nextInt();
       System.out.print("Enter c :: ");
       int c = scan.nextInt();
       Quadratic testX = new Quadratic(a,b,c);
       testX.print();
       
    }
}