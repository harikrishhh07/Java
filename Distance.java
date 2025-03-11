import java.util.Scanner;

public class Distane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("Distance in yards: %.2f\n", distanceInYards);
        System.out.printf("Distance in miles: %.6f\n", distanceInMiles);
        System.out.print("Enter your height in cm: ");
        double heightInCm = scanner.nextDouble();
        double heightInInches = heightInCm / 2.54;
        double heightInFeet = heightInInches / 12;
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f\n", heightInCm, Math.floor(heightInFeet), (heightInFeet - Math.floor(heightInFeet)) * 12);
        scanner.close();
    }
}