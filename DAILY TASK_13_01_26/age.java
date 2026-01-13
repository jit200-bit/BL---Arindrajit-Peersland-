import java.util.*;
public class age{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
        int currentYear = 2025;
        int BirthYear;
        System.out.print("Enter the birth year = ");
        BirthYear = in.nextInt();
        int age = currentYear-BirthYear;
        System.out.println("AGE = "+ age);
        
    }
}