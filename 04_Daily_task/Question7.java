import java.util.*;
public class  Question7
{
    public static int sumof(int n)
    {
       int sum = 0;
       for(int i = 0;i<=n;i++)
       {
        sum = sum+i;
       }
       return sum;
    }
    public static void main(String arsgs[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int no = in.nextInt();

        int result = sumof(no);
        System.out.println("The sum = "+result);
    }
}