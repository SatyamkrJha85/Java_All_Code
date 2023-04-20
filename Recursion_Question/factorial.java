package Recursion;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int no=5;
           System.out.println(fact(no));
	}


public static int fact(int n){
	if(n==1) {
		return 1;
	}
	/*int fnm=fact(n-1);
	int fn=n*fact(n-1);
	return fn;*/
	return n*fact(n-1);
}
}