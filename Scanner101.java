import java.util.Scanner;
public class Scanner101
{
  public static void main(String args[])
  {
    Scanner fromKey = new Scanner(System.in);
   
    System.out.print("Please input your age--> ");
    int age = fromKey.nextInt();
   
    System.out.print("Please enter your name--> ");
    String name = fromKey.nextLine();

    System.out.println("Age:: " + age);
    System.out.println("Name:: " + name);
  }
}
