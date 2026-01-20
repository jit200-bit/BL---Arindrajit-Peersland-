import java.util.Scanner;

public class Question9L2 {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();

            if (isPositive(nums[i])) {
                System.out.println(isEven(nums[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(nums[0], nums[4]);

        if (result == 1)
            System.out.println("First element is greater");
        else if (result == 0)
            System.out.println("First and last elements are equal");
        else
            System.out.println("First element is less");

        sc.close();
    }
}
