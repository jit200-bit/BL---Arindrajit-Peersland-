import java.util.Scanner;

public class L1Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();

            if (numbers[i] > 0) {
                System.out.println("Positive");
                System.out.println(numbers[i] % 2 == 0 ? "Even" : "Odd");
            } else if (numbers[i] < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        }

        if (numbers[0] == numbers[4])
            System.out.println("First and last elements are equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is greater");
        else
            System.out.println("Last element is greater");

        sc.close();
    }
}
