import java.util.Scanner;
public class HeightConverter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heightCm;
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        double heightInches = heightCm / 2.54;
        int feet = (int) (heightInches / 12);
        double inches = heightInches % 12;
        System.out.printf("Your height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, inches);
        input.close();
    }
}