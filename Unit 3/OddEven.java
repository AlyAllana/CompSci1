import java.util.Scanner;
/**
 * Write a description of class OddEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddEven {
    public static void main (String[]args) {
        int integer = 0;
        int check;
        
        
        Scanner fromKey = new Scanner(System.in);
        
        System.out.print("Enter a integer number :: ");
        integer = fromKey.nextInt ();
        
        check = integer % 2;
        if (check == 0) {System.out.println(integer + " is even ");}
        
        if (check == 1) {System.out.println(integer + " is odd ");}

        
    }
}
