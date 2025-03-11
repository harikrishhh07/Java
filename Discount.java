import java.util.Scanner;
public class Discount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee, discountPercent;
        System.out.print("Enter the student fee (INR): ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double discountedFee = fee - discount;
        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, discountedFee);
        input.close();
    }
}
