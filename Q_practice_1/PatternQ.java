package apnaCollefge;

public class PatternQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i=1;i<=6;i++) {
			for(int j=1;j<=6-i+1;j++) {
				System.out.print(j+" ");
			
			}
			System.out.println();
		}*/
		
		/*
		int counter =1;
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
			//	System.out.print(j+" ");
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		} */
		/*
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println(); 
		} 
		*/
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
}
}