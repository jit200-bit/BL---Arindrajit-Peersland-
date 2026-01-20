import java.util.*;

public class Question4L2 {

    // Method to check positive or negative
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check even or odd
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int a, int b) {
        if (a > b)
            return 1;
        else if (a == b)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        // Input
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = in.nextInt();
        }

        // Check positive/negative and even/odd
        for (int i = 0; i < arr.length; i++) {

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                if (isEven(arr[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        // Compare first and last elements
        int result = compare(arr[0], arr[arr.length - 1]);

        if (result == 1)
            System.out.println("First element is greater than last element");
        else if (result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less than last element");

        in.close();
    }
}
