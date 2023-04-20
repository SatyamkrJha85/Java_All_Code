package satyam.file;

import java.util.Scanner;

public class Qsolving3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(a+ "X" +i+"=" +a*i);
		}
	}

}
