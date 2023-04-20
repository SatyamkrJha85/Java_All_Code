package apnaCollefge;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=986665676;
		for(int i=0;i<=n;i++) {
			int f=n%10;
			System.out.print(f+" ");
			n=n/10;
		}

	}

}
