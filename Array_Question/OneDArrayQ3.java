import java.util.Scanner;

public class OneDArrayQ3 {

	public static void number(int arr[],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//int target;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("index is " + i);
				
		     }		  		
		  }
	   }
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your size");
		int size=sc.nextInt();
		System.out.println("enter your array");
		int arr[]=new int [size];
		for(int i=0;i<arr.length;i++ ) {
			arr[i]=sc.nextInt();
		}
		System.out.println("searching element");
		int target=sc.nextInt();
		//int arr[]= {3,4,5,6,7,8,9};
	    number(arr,target);
	       
	}

}
