import java.util.Scanner;
public class AssignmentQuestion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // Q1 print duplicate elemnt 
		
		
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int [3][3];
		System.out.println("enter array element ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();			
			}
		}
		
	/*	for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");		
			}
			System.out.println();
		}
		System.out.println("enter your checking element");
		int search=sc.nextInt();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==search);
				sum++;
			}
			
		}
		System.out.println(sum);
		*/
		
		
		//Q2 sum of 2nd row or any row and col:
	/*	int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[0][i];
		}
		System.out.println(sum);
		*/
		
		//Q 3 transpose matrix:
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}

}
