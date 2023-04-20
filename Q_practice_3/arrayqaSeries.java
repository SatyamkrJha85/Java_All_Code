package satyam.file;

import java.util.Scanner;

public class arrayqaSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int [10];
		for(int i=0;i<a.length;i++) {
			System.out.println("enter a number of a"+i);
			a[i]=sc.nextInt();
		}
		int greater=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>greater)
				greater=a[i];
			if(a[i]<small)
				small=a[i];
		}
		System.out.println(greater   + " and " +small);
		  }
		}