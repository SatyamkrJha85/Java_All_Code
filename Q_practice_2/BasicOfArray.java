package satyam.file;

import java.lang.reflect.Array;
import java.util.Scanner;

public class BasicOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your size");
		int size=sc.nextInt();
		int num[]=new int [size];
		int sum=0;
		for(int i=0;i<size;i++) {
			//System.out.println("enter your names");
		   num[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			 sum=sum+num[i];
			System.out.println(sum);
		//	System.out.println(i=1+ "is" +name[i]);
		//	System.out.println(name.length);
		}

	}

}
