
public class MaxSubArrayKadanes {
	public static void kadanes(int arr[]) {
		int sum=0;
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum<0) {
				sum=0;
			}
			largest=Math.max(sum, largest);
		}
		System.out.println("is "+ largest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		//int arr[]= {-2,-3,4,-1,-2,1,5,-3};
		//int arr[]= {8,-1,-6,7,6};
		int arr[]= {1, -2 ,4 ,-5 ,1};
		kadanes(arr);
	}

}
