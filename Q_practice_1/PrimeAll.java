package apnaCollefge;

public class PrimeAll {

	public static boolean  prime(int  n) {
		boolean prime=true;
		for(int  i=2;i<n-1;i++) {
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	public static void Totalprime(int n) {
		for(int i=2;i<=n;i++) {
			if(prime(i)) {
				System.out.println(i);
			}
		}
		//System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  System.out.println(prime(5));
		//System.out.println(prime(5));
		Totalprime(20);
	}

}
