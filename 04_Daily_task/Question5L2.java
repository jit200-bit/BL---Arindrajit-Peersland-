import java.util.*;

public class Question5L2 {

    // Method to calculate BMI and store in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            data[i][2] = weight / (heightInMeters * heightInMeters);
        }
    }

    // Method to get BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double[][] persons = new double[10][3];

        // Input weight and height
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = in.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = in.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Display result
        System.out.println("\nWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    getBMIStatus(persons[i][2]));
        }

        in.close();
    }
}
