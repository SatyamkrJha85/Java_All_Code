 import java.util.Scanner;

 public class MaxSubArraySum {
	public static void subarray(int arr[]) {
		int currsum=0;
		int maxsum=Integer.MIN_VALUE;
		//int pairs=(arr.length)*(arr.length+1)/2;// formula is n*n+1/2
		for(int i=0;i<arr.length;i++) {
			int start=i;
			for(int j=i;j<arr.length;j++) {
				int end=j;
			currsum=0;
				for(int k=start;k<=end;k++) {
					currsum=currsum+arr[k];
				}
				System.out.println(currsum);
				if(maxsum<currsum) {
					maxsum=currsum;
				}			
			}		
		}
		System.out.println("max sum is "+maxsum);
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter your array size");
		int size=sc.nextInt();
		int arr[]=new int [size];
		for(int i=0;i<size;i++) {
	       arr[i]=sc.nextInt();
		}
		*/
     int arr[]= {1,-2,4,-5,1};
    
    //int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
          subarray(arr); 
	
		
		}
		

}
