import java.util.*;
public class SubArray {
	public static void subarray(int arr[]) {
		int pairs=(arr.length)*(arr.length+1)/2;// formula is n*n+1/2
		for(int i=0;i<arr.length;i++) {
			int start=i;
			for(int j=i;j<arr.length;j++) {
				int end=j;
				for(int k=start;k<=end;k++) {
			System.out.print(arr[k]+" ");				
				}
				System.out.println();
			}
			System.out.println();
			
		}
		System.out.println("total pair is "+pairs);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
	       arr[i]=sc.nextInt();
		}
     //int arr[]= {2,4,6,8,10};
          subarray(arr);
	
		
		}
		
	
}
