package Recursion;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=25;
         System.out.println(fibo(n));
	}
	public static int fibo(int s) {
		if(s==0 || s==1) {
			return s;
		}
		int f1=fibo(s-1);
		int f2=fibo(s-2);
		int fn=f1+f2;
		return fn;
		
	}

}
