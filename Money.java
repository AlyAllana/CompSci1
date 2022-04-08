/**
 * Calculaing total value in dollars and cents 
 *
 * Aly Allana
 * January 21, 2022
 */
import java.util.Scanner;
public class Money{
    public static void main (String[]args){
        Scanner fromKey = new Scanner (System.in);
        
        int quarters = 0; //number of quarters
        int dimes = 0; //number of dimes
        int nickels = 0; //number of nickels
        int pennies = 0; //number of pennies
        int totalCents = 0; //total cents collected
        int dollars = 0; //dollar ammount 
        int cents = 0; //cents amount
        
        System.out.print ("How many pennies do you have --> ");
        pennies = fromKey.nextInt();
        
        System.out.print ("How many nickels do you have --> ");
        nickels = fromKey.nextInt();
        
        System.out.print ("How many dimes do you have --> ");
        dimes = fromKey.nextInt();
        
        System.out.print ("How many quarters do you have --> ");
        quarters = fromKey.nextInt();
        
        System.out.println();
        
        totalCents = (quarters * 25) + (dimes * 10) + (nickels * 5) + (pennies);
        
        dollars = totalCents / 100;
        cents = totalCents % 100;
        
        System.out.println("Total value" + " = " + dollars + " dollars " + "and " + cents + " cents ");
        
    }
}
