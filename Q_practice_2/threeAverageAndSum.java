package myPack;
import java.util.Scanner;
public class threeAverageAndSum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first  number");
		int a =sc.nextInt();
		System.out.println("enter second number");
		int b =sc.nextInt();
		System.out.println("enter third number");
		int c =sc.nextInt();
		int sum=a+b+c/3;
		System.out.println("average of "+sum);

	}

}
