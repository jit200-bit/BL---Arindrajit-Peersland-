import java.util.*;

public class Ques3L2 {

    // Method to check whether a year is a leap year
    public static boolean isLeapYear(int year) {

        // Condition a and b for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = in.nextInt();

        // Check for Gregorian calendar validity
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        in.close();
    }
}
