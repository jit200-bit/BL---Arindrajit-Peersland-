import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double value;

        while (true) {
            value = sc.nextDouble();
            if (value == 0)
                break;
            total += value;
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}
