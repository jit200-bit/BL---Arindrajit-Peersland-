import java.util.*;
public class Question6 {

    // Method to check Spring Season
    public static boolean isSpringSeason(int month, int day) {

        if ((month == 3 && day >= 20) ||
            (month == 4) ||
            (month == 5) ||
            (month == 6 && day <= 20)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Taking command line arguments
        System.out.println("Enter the month number = ");
        int month = in.nextInt();
        System.out.println("Enter the date = ");
        int day = in.nextInt();

        // Calling the method
        boolean result = isSpringSeason(month, day);

        // Output
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
