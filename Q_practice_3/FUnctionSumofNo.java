package satyam.file;

import java.util.Scanner;

public class FUnctionSumofNo {
	public static int satyam(int a,int b,int c){
		return a+b+c/3;

	}

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a three  number");
       int a =sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       satyam(a,b,c);
       System.out.println(satyam(a,b,c));
     
}
}