import java.util.Scanner;

public class Mixup {
    public static void main(String[] args) {
        Scanner fromKey = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = fromKey.nextLine();

        System.out.println("Mixed up string: " + word.substring(word.length()/2) + word.substring(0, (word.length()/2)));
    }
}