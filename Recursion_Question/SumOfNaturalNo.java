package Recursion;

public class SumOfNaturalNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int n=10;
		System.out.println("The sum of natural no is:  "+narural(n));
		System.out.println("The original value of the N is: "+ n);
	}
	public static int narural(int s) {
		if(s==1) {
			return 1;
		}
		int sef=narural(s-1);//4
		int se=s+sef;//5+4
		return se;//9 and recursion running in loop until s==1:
	}
	

}
