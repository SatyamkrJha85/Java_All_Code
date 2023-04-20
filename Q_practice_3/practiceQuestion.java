package satyam.file;

import java.util.Scanner;

public class practiceQuestion {
	public static void satyam(int n ) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%2 !=0) {
			sum=sum+i;
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of n");
		int n=sc.nextInt();
          satyam(n);
	}

}
