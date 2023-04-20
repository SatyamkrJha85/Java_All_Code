package Recursion;

public class Return_Array_Last_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,3,5,2,4};
		int key=4;
		System.out.println("array index is : "+lastIndex(arr,key,0));
	}
	public static int lastIndex(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		int found=lastIndex(arr,key,i+1);
		if(found==-1 && arr[i]==key) {
			return i;
		}
		return found;
	}

}
