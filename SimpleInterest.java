import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter time: ");
        double timeInterest = scanner.nextDouble();
        double simpleInterest = (principal * rate * timeInterest) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + timeInterest);
    }
}