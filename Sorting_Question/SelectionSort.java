
public class SelectionSort {
 public static void selectionsort(int arr[]) {
	 for(int i=0;i<arr.length-1;i++) {
		 int min=i;
		 for(int j=i+1;j<arr.length;j++) {
			 if(arr[min]>arr[j]) {
				 min=j;
			 }		 
		 }
		 int temp=arr[min];
		 arr[min]=arr[i];
		 arr[i]=temp;
	 }
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }
	 System.out.println();
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[]= {3,6,5,45,3,7,8};
           selectionsort(arr);
	}

}
