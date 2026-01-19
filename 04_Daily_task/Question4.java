import java.util.*;

public class Question4 {

    // Method to calculate number of rounds
    public static double calculateRounds(int a, int b, int c) {
        int perimeter = a + b + c;
        return 5000.0 / perimeter;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the length of the first side: ");
        int F = in.nextInt();

        System.out.print("Enter the length of the second side: ");
        int S = in.nextInt();

        System.out.print("Enter the length of the third side: ");
        int T = in.nextInt();

        double rounds = calculateRounds(F, S, T);

        System.out.println("The number of rounds he has to run = " + rounds);
    }
}
