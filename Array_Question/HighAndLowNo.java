import java.util.*;
public class HighAndLowNo {
	public static void number(int arr[]) {
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(largest<arr[i]) {
				largest=arr[i];	
			}
			else if(smallest>arr[i]) {
				smallest=arr[i];
			}
			//System.out.println(largest);
			
		}
		System.out.println(largest);
		System.out.println(smallest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {344,4567,5433,56};
	number(arr);
	}

}
