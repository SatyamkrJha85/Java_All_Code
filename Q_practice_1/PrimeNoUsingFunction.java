package apnaCollefge;

public class PrimeNoUsingFunction {
	
	
	public static boolean  prime(int  n) {
		boolean prime=true;
		for(int  i=2;i<n-1;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		if(prime==true) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("no is not prime");
		}
		return prime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  System.out.println(prime(5));
		System.out.println(prime(5));
	}

}
