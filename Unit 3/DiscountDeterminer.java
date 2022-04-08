import java.util.Scanner;
/**
 * Write a description of class DiscountDeterminer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiscountDeterminer{
    public static void main (String[]args){
        double bill = 0;
        double discount = .85;
        Scanner fromKey = new Scanner(System.in);
        
        System.out.print("Enter the original bill amount :: ");
        bill = fromKey.nextDouble();
        if (bill >= 2000) {
           bill = bill * discount
        ;}
        
        System.out.print("Bill after discount :: " + bill);

        }
    }

