package Recursion;

public class Array_is_Sorted_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		System.out.println(insorted(arr,0));
		int arr1[]= {4,5,3,2,5,3};
		System.out.println(insorted(arr1,0));

	}
	public static boolean insorted(int arr[],int i) {
		if(i==arr.length-1) {
			return true;
		}
		if(arr[i]>arr[i+1]) {
			return false;
		}
		return insorted(arr,i+1);
	}

}
