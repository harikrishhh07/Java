import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        int handshakes = (students * (students - 1)) / 2;
        System.out.println("The number of possible handshakes is " + handshakes);
    }
}