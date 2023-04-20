package Recursion;

public class Return_Array_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		int arr[]= {4,3,2,54,6};
		int key=6;
		System.out.println("Your Key Index Is : "+index(arr,key,0));
	}
	public static int    index(int arr[],int key,int i) {
		if(i==arr.length) {
			return -1;
		}
		if(key==arr[i]) {
			return i;
		}
		return index(arr,key,i+1);
	}

}
