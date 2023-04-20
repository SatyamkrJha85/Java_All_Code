
public class BubbleSort {
public static void bubblesort(int arr[]) {
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1-i;j++) {
			if(arr[j+1]<arr[j]) {
				int temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+ " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,45,76,3,3,56,6};
		bubblesort(arr);
	}

}
