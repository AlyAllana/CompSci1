
/**
 * DashedWord Lab
 *
 * @author Aly Allana
 * @version Unit 4.0
 */
public class DashedWord
{
    public void dashVoid (String word) //void method
    {
        int len = word.length()-1;
        String dashedWord = "";
        for(int i = 0; i <= len; i++)
        {
          if(i < len)
          {
              dashedWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == len)
          {
              dashedWord += (word.substring(i,(i+1)));
          }
        }
        System.out.println("\nVoid Method :: ");
        System.out.println("Dashed word :: " + dashedWord);
    }
    public String dashReturn(String word) //return method
    {
        int len = word.length()-1;
        String dashedWord = "";
        for(int i = 0; i <= len; i++)
        {
          if(i < len)
          {
              dashedWord += (word.substring(i,(i+1)) + "-"); 
          }
          else if(i == len)
          {
              dashedWord += (word.substring(i,(i+1)));
          }
        }
        System.out.println("\nReturn Method :: ");
        return dashedWord;
    }
}