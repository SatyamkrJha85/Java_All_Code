package apnaCollefge;

public class BinaryToDecimal {
	public static void dectobin(int n) {
		int num=0;
		int pow=0;
		int binnum=0;
		while(n>0) {
			int rem=n%2;
			binnum=binnum+(rem *(int )Math.pow(10,pow));
			pow++;
			n=n/2;
		}
		System.out.println("to binary is "+binnum);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              dectobin(5);

	}
	}
