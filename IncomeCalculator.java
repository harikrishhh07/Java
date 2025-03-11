import java.util.Scanner;
public class IncomeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = scanner.nextDouble();
        double income = salary + bonus;
        System.out.println("The salary is INR " + salary);
        System.out.println("and bonus is INR " + bonus);
        System.out.println("Hence Total Income is INR " + income);
    }
}
