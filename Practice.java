import java.util.Scanner;
public class Practice{
 	public static void main(String[]args){
 			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter the temperature in celsius:");
 			int celsius=sc.nextInt();
 			int result=(celsius*9/5)+32;
 			System.out.println("the result in farenheit is:");
 			Scanner.close();


 	}
 }