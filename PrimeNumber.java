import java.util.Scanner;
public class PrimeNumber
{
    public static void main (String args [])
    {
    Scanner fromKey = new Scanner(System.in);
    int num = 0;
    System.out.print("Please enter a number to determine if it is a prime number:: ");
    num = fromKey.nextInt();
    System.out.println();
    for (int i = 2; i <= num / 2; ++i) 
    {
      if (num % i == 0) 
      {
        System.out.println(num + " is not a prime number.");
        break;
      }
      else
        System.out.println(num + " is a prime number.");
        break;
      }
  }
}
        
        

    

    