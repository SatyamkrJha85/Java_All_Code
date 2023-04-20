package satyam.file;

import java.util.Scanner;

public class random {
	public static void satyam(int a,int b) {
		if(a>b)
		{
			System.out.println("a is a greater no");
		}
		else
		{
			System.out.println("b is greater no");
		}
		return ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("satyam jha");
Scanner sc=new Scanner(System.in);
System.out.println("enter a two number");
int a=sc.nextInt();
int b=sc.nextInt();
//int c=sc.nextInt();
satyam(a,b);
//System.out.println(sum);
	}

}
