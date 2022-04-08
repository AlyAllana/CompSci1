import java.util.Scanner;
public class GreatestCommonDivisor
{
    public static void main (String [] args)
    {
    int x, y = 0;
    Scanner fromKey = new Scanner(System.in);
    x = fromKey.nextInt();
    y = fromKey.nextInt();
    int gcd = 1;
    System.out.println();
    for (int i = 1; i <= x && i <= y; ++i) 
    {
      if(x%i==0 && y%i==0) 
      gcd = i;
    }
    System.out.printf("GCD of " + x + " and " + y + " is " + gcd);  
    }
}
    
    

        
        

    

    