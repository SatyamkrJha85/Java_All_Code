package myPack;
import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter number :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0)
		{
			System.out.println("number is even ");
		}
		else
		{
			System.out.println("number is odd");
		}
		

	}

}
