import java.util.*;
public class Question11
{
    public static double[] trigimetric(double angle)
    {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin , cos,tan};
    }

    public static void main(String args[])
    {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the digree = ");
        double angle  = in.nextInt();
        
        double result[] = trigimetric(angle);

        System.out.println("the Sin value = "+ result[0]);
        System.out.println("the Cos value = "+ result[1]);
        System.out.println("the Tan value = "+ result[2]);

    }
}