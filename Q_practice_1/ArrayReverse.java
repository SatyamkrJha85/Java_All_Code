package apnaCollefge;

public class ArrayReverse {
	public static void reverse(int arr[]) {
		int first=0;
		int last=arr.length-1;
		while(first<=last) {
			int temp=arr[last];
			arr[last]=arr[first];
			arr[first]=temp;
			first++;
		    last--;
		}
	}

	public static void main(String[] args) {
		
		// solve in easy way
		
	  // TODO Auto-generated method stub
      /*      int arr[]= {34,43,56,43,356};
            for(int i=arr.length-1;i>=0;i--) {
            	System.out.println(arr[i]);
            	
            }
            */
		int arr[]= {434,45,43,34,678,56};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		       System.out.println();  
	 }

}
