package satyam.file;

import java.util.Scanner;

public class FactorialinFunction {
	public static void satyam(int n) {
		int fact=1;
		for(int i=n;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
System.out.println("enter a no of n");
int n=sc.nextInt();
satyam(n);
	}

}
