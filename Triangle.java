import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height of the triangle in inches: ");
        double height = scanner.nextDouble();
        double areaInSqInches = 0.5 * base * height;
        double areaInSqCm = areaInSqInches * 6.4516; 
        double heightInCm = height * 2.54;
        int heightInFeet = (int) (height / 12);
        double remainingInches = height % 12;
        System.out.printf("The area of the triangle is %.2f square inches and %.2f square centimeters.%n", areaInSqInches, areaInSqCm);
        System.out.printf("Your height in cm is %.2f, while in feet is %d and inches is %.2f.%n", heightInCm, heightInFeet, remainingInches);
        scanner.close();
    }
}