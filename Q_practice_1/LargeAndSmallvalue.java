package apnaCollefge;
import java.util.*;
public class LargeAndSmallvalue {

	public static int largest(int number[]) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<number.length;i++) {
			if(largest<number[i]) {
				largest =number[i];
			}
			if(smallest>number[i]) {
				smallest=number[i];
			}
			
		}
		System.out.println("smallest number is "+smallest);

		return largest;
	}
	
		public static void main(String args[]) {	
			int arr[]= {45,65,44,35,34,789544};
			
			System.out.println("largest number is "+ largest(arr));
		}
}
