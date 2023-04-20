package satya;

import java.util.*;

public class faltu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
		 Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.printf("%-15s%03d\n",s1,x);
             // System.out.printf("%012s %07d"\n,s1,x);
            //  System.out.printf("%-15s%03d\n",s1,x);

        }
        System.out.println("================================"); 
		
		int a[]= {43,54,54,554,4,55544,5,6,5,545};
		int x=545;
		for(int i=0;i<10;i++) {
			if(x==a[i]) {
				System.out.println(a[4]*a[6]);
			}
		}*/
		//int  a = 7;
		
                       int arr[]= {56,57,67,78,89,90,98};
                       int n=arr.length;                   
                       int search=98;
	                      int start=0;
	                      int last=n;
	                      int mid;	                    
	                      while(start <=n) {
	                    	  int k;
	                    	  mid=start+(last-start)/2;
	                    	  if(arr[mid]<search) {
	                    		  start =mid+1;
	                    		  break;
	                    	  }
	                    	  else if(arr[mid]>search) {
	                    		  last=mid-1;
	                    		  
	                    	  }
	                    	  else {
	                    		  System.out.println(mid);
	                    	  }
	                      }
	                      
	/*
	  	int arr[]= {56,67,78,87,89,90};
	 
		int start=0;
		int last=arr.length;
		int search=89;
		while(start<=last){
	     int mid=(start+last)/2;
	     if(arr[mid]<search) {
	    	 mid=mid+1;
	     }
	     else if(arr[mid]>search) {
	    	 mid=mid-1;
	     }
	     else {
	    	 System.out.println(mid);
	     }
		
	    	// if(k==1) {
	    	//	 System.out.println("your index is "+ mid);
	    	// }
	    	// else {
	    	//	 System.out.println("index not found");
	    	// }
	}
	*/
	}
}
