import java.util.Scanner;
public class CharacterAnalyzer 
{
    public static void main (String[]args) 
    {
        Scanner fromKey = new Scanner(System.in);
        
    
        System.out.print("Enter a letter:: ");
        char userInput = fromKey.next().charAt(0);
        int asciiValue = userInput;
        
        
        if (userInput >= 65)
        {
            if (userInput <= 90)
            {
                System.out.println(userInput + " is an uppercase character." + " ASCII == " + asciiValue);
            }
        }
        if (userInput >= 97)
        {
            if (userInput <= 122)
            {
                System.out.println(userInput + " is a lowercase character." + " ASCII == " + asciiValue);
            }
        }
        if (userInput >= 48)
        {
            if (userInput <= 57)
            {
                System.out.println(userInput + " is a number." + " ASCII == " + asciiValue);
            }
        }
        




    }
}
