package satyam.file;
import java.util.Scanner;
public class RandomI {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a no of x");
		int x=sc.nextInt();
		System.out.println("enter a no of n");
		int n=sc.nextInt();
		int result =1;
		for(int i=1;i<=n;i++)
		result=result*x;
		{
			System.out.println(result);
		}
	}
}
