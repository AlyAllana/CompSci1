public class RectanglePerimeter
{
    public void perimeterVoid(int length, int width)
    {
        int perimeter = (2 * length) + (2 * width);
        System.out.println("\nVoid Method :: ");
        System.out.println("The perimeter is :: " + perimeter);
    }
    public int perimeterReturn(int width, int length)
    {
        int perimeter = (2 * width) + (2 * length);
        System.out.println("\nReturn Method :: ");
        System.out.println("The perimeter is :: " + perimeter);
        return perimeter;
    }
}