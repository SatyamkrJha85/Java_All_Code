// question is find power of no
package satyam.file;

import java.util.Scanner;

public class FunctionQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a no of x");
		int x=sc.nextInt();
		System.out.println("enter a no of n");
		int n=sc.nextInt();
		int result=1;
		for(int i=1;i<=n;i++) {
			result=result*x;
	}
		System.out.println(result);
	}

}
