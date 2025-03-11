import java.util.Scanner;
public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter distance from to via in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance via to final city in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter time taken in hours: ");
        double time = scanner.nextDouble();
        System.out.println("The results of Int Operations are " + (fromToVia + viaToFinalCity) + ", " + (fromToVia - viaToFinalCity) + ", and " + (fromToVia * time));
    }
}
