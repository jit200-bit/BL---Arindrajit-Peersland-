import java.util.Scanner;

public class L2Question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter from city: ");
        String fromCity = sc.next();

        System.out.print("Enter via city: ");
        String viaCity = sc.next();

        System.out.print("Enter to city: ");
        String toCity = sc.next();

        System.out.print("Enter distance from to via (miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from via to final city (miles): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time taken (hours): ");
        double time = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / time;

        System.out.println(name + " travelled from " + fromCity +
                " via " + viaCity + " to " + toCity);
        System.out.println("Total Distance: " + totalDistance +
                " miles, Speed: " + speed + " miles/hour");

        sc.close();
    }
}
