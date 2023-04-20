package satya.file;

import java.util.Scanner;

public class ArrayBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number of element");
		int size=sc.nextInt();
int num[]=new int[size];
for(int i=0;i<size;i++)
{
	System.out.println(num[i]);
}
	}

}
