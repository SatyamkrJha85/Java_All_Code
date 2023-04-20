package satyam.file;

import java.util.Scanner;

public class arrayQueBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a mark");
		int mark=sc.nextInt();
int num[]=new int [mark];
for(int i=0;i<mark;i++) {
System.out.println("enter a number");
	 num[i]=sc.nextInt();
}
System.out.println("enter a element do yout search");
int x=sc.nextInt();
for(int i=0;i<num.length;i++)
	if(num[i]==x)
{
	System.out.println("x found at index:"+i);
}
	}

}
