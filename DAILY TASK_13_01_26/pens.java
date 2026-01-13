import java.util.*;
public class pens {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int NP , P;
        System.out.println("Enter the number of pens available = ");
        NP = in.nextInt();
        System.out.println("Enter the number of people available = ");
        P = in.nextInt();
        float each = NP/P;
        System.out.println("Each will get = "+ each);
        
    }
}
