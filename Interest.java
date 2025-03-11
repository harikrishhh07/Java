import java.util.Scanner;
public class Interest{
	public static void main(Sring[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.print("enter the principal:");
		int principal=scanner.nextInt();
		System.out.print("enter the rate:");
		int rate=scanner.nextInt();
		System.out.print("enter the time:");
		int time=scanner.nextInt();
		int simpleinterest=principal*rate*time/100;
		System.out.print("the simple interest is:"+simpleinterest);
		


	}
}