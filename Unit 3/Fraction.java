import java.util.Scanner;
public class Fraction
{
    public static void main (String[]args)
    {
        Scanner fromKey = new Scanner(System.in);

        //Variables
        String problem = "";
        int numerator1;
        int denominator1;
        String operator;
        int numerator2;
        int denominator2;
        int numAns; 
        int denomAns;
    
        System.out.print("Enter the fraction problem  (ex: 2/3 + 3/4) --> ");
        problem = fromKey.nextLine();
    
        numerator1 = Integer.parseInt(problem.substring(0,1));
        denominator1 = Integer.parseInt(problem.substring(2,3));
        numerator2 = Integer.parseInt(problem.substring(6,7));
        denominator2 = Integer.parseInt(problem.substring(8,9));
        operator = problem.substring(4,5);
    
        if(denominator1 == 0|| denominator2 == 0)
        {
            System.out.println("ERROR: UNDEFINED because you entered a zero");
        }
    
        if (operator.equals("+"))
        {
            numAns = (numerator1 * denominator2) + (denominator2 * numerator2);
            denomAns = (denominator1 * denominator2);
            System.out.println(numAns + "/" + denomAns);
        }
         if (operator.equals("-"))
        {
            numAns = (denominator2 * numerator1) - (denominator1 * numerator2);
            denomAns = (denominator1 * denominator2);
            System.out.println(numAns + "/" + denomAns);
        }
         if (operator.equals("*"))
        {
            numAns = (numerator1 * numerator2);
            denomAns = (denominator1 * denominator2);
            System.out.println(numAns + "/" + denomAns);
        }
         if (operator.equals("/"))
        {
            numAns = (numerator1 * denominator2);
            denomAns = (denominator1 * numerator2);
            System.out.println(numAns + "/" + denomAns);
        }
    }
}