import java.util.*;
public class Question8
{
    public static int findmax(int a , int b,int c)
    {
        int max = a;
        if(b>max)
         {
            max = b;
         }
        else if(c>max)
         {
            max = c;
         }
        
        return max;
    }

    public static int findsmall(int a , int b, int c)
    {
        int sam = a;
        if(b<sam)
        {
            sam = b;
        }
        else if(c<sam)
        {
            sam = c;
        }
        return sam;
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First number = ");
        int a= in.nextInt();
        System.out.println("Enter the Second number = ");
        int b= in.nextInt();
        System.out.println("Enter the Third number = ");
        int c= in.nextInt();

        int large = findmax(a, b, c);
        int small = findsmall(a, b, c);

        System.out.println("The largest number = "+ large);
        System.out.println("The smallest number = "+ small);
    }
}