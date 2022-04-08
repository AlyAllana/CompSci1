import java.util.Random;
import java.lang.Math;
public class QuickPick{
    public static void main (String[]args){
        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("===========================");
        
        double randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        int randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");
        
        
        randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");
        
        randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");
        
        randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");
        
        randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");
        
        randomDouble = Math.random();
        randomDouble = randomDouble * 50 + 1;
        randomInt = (int) randomDouble;
        System.out.print(randomInt);
        System.out.print(" ");

    }
}
