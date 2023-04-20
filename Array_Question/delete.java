import java.util.*;
public class delete {
	public static void water(int arr[]) {
		int n=arr.length-1;
		//water = 5 3 5 6 7 8  
		// left max= 5 5 5 6 7 8
		//right max=8 8 8 8 8 8
		int left[]=new int [n];
		left[0]=arr[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1],arr[i]);
		}
		int right[]=new int[n];
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1],arr[i]);
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			int fin=Math.min(left[i],right[i]);
			sum=sum+fin-arr[i];
		}
		System.out.println(sum);
		
	
	}
	    public static void main(String args[]){
	// int arr[]= {5,3,5,6,7,8,5};
	    	int arr[]= {4,2,0,6,3,2,5};
              water(arr);
	              
	    }
	}
