import java.util.*;

public class Question2 {

    // Method to calculate maximum handshakes
    public static int calculateHandshake(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int no = in.nextInt();

        int hand = calculateHandshake(no);

        System.out.println("The total number of handshakes = " + hand);
    }
}
