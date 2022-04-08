
/**
 * 
 *
 * 
 * @version 1/19/2022
 */
public class Grades{
    public static void main (String[]args){
        //Variables:
        double dailyAvg = 88;
        double quizAvg = 74;
        double testAvg = 95;
        double sixWeeksAvg = 0;
        int roundedAvg = 0;
        
        //Calculating Six Weeks Average 
        sixWeeksAvg = (dailyAvg * 0.3) + (quizAvg * 0.2) + (testAvg * 0.5) + (0.5);
        
        //Casting
        roundedAvg = (int) sixWeeksAvg; 
        
        
        System.out.println ("Daily Average " + "= " + dailyAvg);
        System.out.println ("Quiz Average " + "= " + quizAvg);
        System.out.println ("Test Average " + "= " + testAvg);
        System.out.println("--------------------------");
        System.out.println ("Six Weeks Average " + "= " + roundedAvg);

    
    }
}
