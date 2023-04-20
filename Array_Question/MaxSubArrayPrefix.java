
public class MaxSubArrayPrefix {

	public static void satya(int arr[]) {
		int sum=0;
		int largest=Integer.MIN_VALUE;
		int prefix[]=new int[arr.length];
		
		
		prefix[0]=arr[0];
		for(int i=1;i<prefix.length;i++) {
			prefix[i]=prefix[i-1]+arr[i];
		}
		
		
		for(int i=0;i<arr.length;i++) {
			int start=i;
			for(int j=i;j<arr.length;j++) {
				int end=j;
				
sum=start==0 ? prefix[end] : prefix[end]-prefix[start-1];
if(sum>largest) {
	largest=sum;
                }
			}
		}
		System.out.println("Max is "+largest);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int arr[]= {1,2,4,6,8 };
             satya(arr);
	}

}
