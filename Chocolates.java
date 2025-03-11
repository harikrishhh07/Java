import java.util.Scanner;
public class Chocolates{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = scanner.nextInt();
        System.out.print("Enter number of children: ");
        int children = scanner.nextInt();
        System.out.println("The number of chocolates each child gets is " + (chocolates / children) + " and the number of remaining chocolates are " + (chocolates % children));
    }
}