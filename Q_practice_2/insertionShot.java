package satya;

public class insertionShot {
	public static void printarray(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		int arr[]= {23,45,324,564,65};
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]> current ) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		printarray(arr);
	}

}
