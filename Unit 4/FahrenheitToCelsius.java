public class FahrenheitToCelsius
{
    //Void Method
    public void fahrenheitToCelsiusVoid (double input)
    {
        double subtraction = input - 32.0;
        double division = 5.0 / 9.0;
        double celsius = subtraction * division;
        System.out.println("\nVoid Method :: ");
        System.out.println(input + " degrees Fahrenheit == " + celsius + " degrees Celsius");
    }
    //Return Method
    public double fahrenheitToCelsiusReturn (double input)
    {
        double subtraction = input - 32.0;
        double division = 5.0 / 9.0;
        double celsius = subtraction * division;
        System.out.println("\nReturn Method :: ");
        System.out.println(input + " degrees Fahrenheit == " + celsius + " degrees Celsius");
        return celsius;
    }
}