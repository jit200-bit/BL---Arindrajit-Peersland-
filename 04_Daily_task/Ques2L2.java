import java.util.*;

public class Ques2L2 {

    // Recursive method to find sum of n natural numbers
    public static int sumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        // Check if number is a natural number
        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number.");
            return;
        }

        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);

        System.out.println("\nSum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);

        // Compare both results
        if (sumRecursion == sumFormula) {
            System.out.println("Both results are correct and equal.");
        } else {
            System.out.println("Results do not match.");
        }

        in.close();
    }
}
