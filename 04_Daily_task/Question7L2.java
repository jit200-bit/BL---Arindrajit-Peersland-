import java.util.Scanner;

public class Question7L2 {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question7L2 checker = new Question7L2();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Student can vote");
            } else {
                System.out.println("Student cannot vote");
            }
        }
        sc.close();
    }
}
