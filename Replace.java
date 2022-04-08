import java.util.Scanner;

public class Replace {
    public static void main (String[]args) {
        Scanner fromKey = new Scanner(System.in);
            
        System.out.print("Enter a string --> ");
        String word = fromKey.next();
        System.out.println();
        
        String replaceString = word.replace('a','*');
        System.out.println(replaceString);
        

    }
}
