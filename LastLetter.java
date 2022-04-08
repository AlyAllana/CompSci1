import java.util.Scanner;

public class LastLetter {
    public static void main (String[]args) {
        Scanner fromKey = new Scanner(System.in);
            
        System.out.print("Enter a string --> ");
        String word = fromKey.next();
        System.out.println();
        int totalLetters = word.length();
        char lastLetter = word.charAt((totalLetters) - 1);
        System.out.println("Last letter = " + lastLetter);
        
        

    }
}
