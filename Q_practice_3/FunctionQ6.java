package satyam.file;

import java.util.Scanner;

public class FunctionQ6 {
	public static void satyam(int a) {
		if(a>18)
		{
			System.out.println("person is a eligible to vote");
		}
		else
		{
			System.out.println("person is not a eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc=new Scanner(System.in);
           System.out.println("enter a no of n");
           int n=sc.nextInt();
           satyam(n);
	}

}
