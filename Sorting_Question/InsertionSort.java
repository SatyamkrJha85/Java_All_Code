
public class InsertionSort {
	public static void insertionsort(int arr[]){//3 5 4 3 23 4 5 
		for(int i=1;i<arr.length;i++) {
			int value=arr[i];
			int hole=i-1;
			while(hole>=0 && arr[hole]>value) {
				arr[hole]=arr[hole-1];
			}
			arr[hole+1]=value;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {3,5,4,3,23,4,5};
          for(int i=1;i<arr.length;i++) {
    			System.out.print(arr[i]+ " ");
    		}
    		System.out.println();
          insertionsort(arr);
          for(int i=0;i<arr.length;i++) {
  			System.out.print(arr[i]+ " ");
  		}
	}

}
