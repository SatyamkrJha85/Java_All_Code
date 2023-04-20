package apnaCollefge;

public class BinomialCoffecient {
	public static int fact(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
return fact;	}
	
	public static int bincoff(int n,int r) {
		int factn=fact(n);
		int factr=fact(r);
		int factnmr=fact(n-r);
		int bincof= factn/(factr*factnmr);
		return bincof;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int b=5;
          System.out.println(bincoff(25,4));
	}

}
