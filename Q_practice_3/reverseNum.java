package myPack;

import java.util.Scanner;

public class reverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a five number");
		int n=sc.nextInt();
		int rev=0;
		int rem=0;
		int temp=n;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
		}
		System.out.println("rev is "+ rev);
			
			
			
	}

}
