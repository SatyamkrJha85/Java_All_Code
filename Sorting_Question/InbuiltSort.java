import java.util.Arrays;
public class InbuiltSort {
public static void insertionSort(Integer arr[]) {
		for(int i=0;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
 while(prev>=0 && arr[prev]>curr) {
	 arr[prev+1]=arr[prev];
	 prev--;
 }
 arr[prev+1]=curr;
		}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Integer arr[]= {3,6,7,45,8,4,2};
          //Arrays.sort(arr,Collections,reverseOrder());
          insertionSort(arr);
	}

}
