package apnaCollefge;
import java.util.*;

public class BestBinerySearch {

	public static void search(int size,int arr[],int search) {
		int low=0;
		int high=size;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==search) {
				System.out.println("your index at "+ mid);
				break;
			}
				
			if(arr[mid]<search) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter your array size");
		 int n= sc.nextInt();
			int arr[]=new int [n];
		 System.out.println("enter your array element ");
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 System.out.println("enter your searching no");
		 int search=sc.nextInt();
	
	//for(int i=0;i<n;i++) {
	//	System.out.println(arr[i]);
	//}
		 search(n,arr,search);

}
}
