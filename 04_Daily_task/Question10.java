import java.util.*;
public class Question10
{
    public static int[] findChoco(int N, int M)
    {
        int each  = N/M;
        int rem = N%M;

        return new int[] {each,rem};
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the total no of chocklates = ");
        int N = in.nextInt();
        System.out.println("Enter the total no of Students = ");
        int M = in.nextInt();

        int[] result = findChoco(N, M);

        System.out.println (" Th no of chocklate each will get = "+ result[0]);
        System.out.println("Remaing chocklate = " + result[1]);


    }
}