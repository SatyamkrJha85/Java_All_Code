package apnaCollefge;

public class FunctionAndMethodQues {
	// Q1 average of 3 No
	/*public static void avg(int a,int b,int c) {
		int sum=(a+b+c)/3;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5,y=4,z=3;
           avg(x,y,z);
           */
	
	// Q 2   find odd even using function
	
	/*public static boolean oddEven(int a) {
		//boolean no= false;
		if(a%2==0) {
			return true;
			// break;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		if(oddEven(5)) {
			System.out.println("no is even");
		}
		else {
			System.out.println("no is odd");
		}
			System.out.println(oddEven(8)); */
	
	// Q 3 find palindrome
	
	
	public static void palindrome(int n) {
		//int p;
		for(int i=0;i<=n;i++) {
			int p=n%10;
			System.out.print(p);
			n=n/10;
		}
	}
	public static void main(String[] args) {
		int x=45745;
		palindrome(x); 
	}

}
