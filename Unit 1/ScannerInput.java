/**
 * Scanner Input Lab 
 *
 * @author Aly Allana
 * @version 1/20/2022
 */

import java.util.Scanner;
public class ScannerInput{
    public static void main (String[]args){
        //Scanner Object
        Scanner keyboard = new Scanner(System.in);
        
        //Variables 
        int intOne; //integer one
        int intTwo; //integer two
        double doubleOne; //double one
        double doubleTwo; //double two
        float floatOne; //float one
        float floatTwo; //float two
        short shortOne; //short one
        short shortTwo; //short two
        byte byteOne; //byte one
        byte byteTwo; //byte two
        long longOne; //long one
        long longTwo; //long two
        
        
        //Integer
        System.out.print("Enter an integer :: ");
        intOne = keyboard.nextInt ();
        
        System.out.print("Enter an integer :: ");
        intTwo = keyboard.nextInt();
        
        
        //Double
        System.out.println();
        System.out.print("Enter a double :: ");
        doubleOne = keyboard.nextDouble ();
        
        System.out.print("Enter a double :: ");
        doubleTwo = keyboard.nextDouble();
        
        
        //Float
        System.out.println();
        System.out.print("Enter a float :: ");
        floatOne = keyboard.nextFloat();
        
        System.out.print("Enter a Float :: ");
        floatTwo = keyboard.nextFloat();
        
        
        //Short
        System.out.println();
        System.out.print("Enter a short :: ");
        shortOne = keyboard.nextShort ();
        
        System.out.print("Enter a short :: ");
        shortTwo = keyboard.nextShort();
        
        //Byte
        System.out.println();
        System.out.print("Enter a byte :: ");
        byteOne = keyboard.nextByte ();
        
        System.out.print("Enter a byte :: ");
        byteTwo = keyboard.nextByte ();

        //Long
        System.out.println();
        System.out.print("Enter a long :: ");
        longOne = keyboard.nextLong ();
        
        System.out.print("Enter a long :: ");
        longTwo = keyboard.nextLong ();
        System.out.println();
        
        
        //Output 
        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo); 
        System.out.println();
        System.out.println("double one = " + doubleOne);
        System.out.println("double two = " + doubleTwo); 
        System.out.println();
        System.out.println("float one = " + floatOne);
        System.out.println("float two = " + floatTwo); 
        System.out.println();
        System.out.println("short one = " + shortOne);
        System.out.println("short two = " + shortTwo);
        System.out.println();
        System.out.println("byte one = " + byteOne);
        System.out.println("byte two = " + byteTwo);
        System.out.println();
        System.out.println("long one = " + longOne);
        System.out.println("long two = " + longTwo);      
    }
}
