package Recursion;

public class TilingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		System.out.println("tilling is "+tiling(4));
	}
	public static int tiling(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		//verticle
		
		int fn1=tiling(n-1);
		//Horizontal 
		
		int fn2=tiling(n-2);
		int totway=fn1+fn2;
		return totway;
	}

}
