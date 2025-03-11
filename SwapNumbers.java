import java.util.Scanner;
public class Swapnumbers{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter number1: ");
int number1 = scanner.nextInt();
System.out.print("Enter number2: ");
int number2 = scanner.nextInt();
int temp = number1;
number1 = number2;
number2 = temp;
System.out.println("The swapped numbers are");
System.out.println(number1);
System.out.println(number2);
}
}