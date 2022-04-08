import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner fromKey = new Scanner(System.in);
        int num = 0;
        System.out.print("Please enter a number:: ");
        num = fromKey.nextInt();
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.println();
        System.out.println("Factorial of " + num + " is " + factorial);
    }
}