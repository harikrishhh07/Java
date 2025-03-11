import java.util.Scanner;
public class TemperatureConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit.");
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius.");
        scanner.close();
    }
}