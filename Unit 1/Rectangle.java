/**
 * Write a description of class Rectangle here.
 *
 * @author Aly Allana
 * @version January 21, 2022
 */
import java.util.Scanner;
public class Rectangle{
    public static void main (String [] args){
        Scanner fromKey = new Scanner(System.in);
        int length = 0;
        int width = 0;
        int perimeter = 0;
        int area = 0;
        
        System.out.print("Enter the length --> ");
        length = fromKey.nextInt();
        
        System.out.print("Enter the Width --> ");
        width = fromKey.nextInt();
        
        System.out.println();
        System.out.println();
        
        perimeter = length * 2 + width * 2;
        area = (length * width);
        
        
        
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
        

    }
}
