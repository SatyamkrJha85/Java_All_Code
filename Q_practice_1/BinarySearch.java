package apnaCollefge;
import java.util.*;
public class BinarySearch {
	public static int  binerys(int arr[],int search) {
		 int start=0;
         int end=arr.length;
         while(start <=end){
       	  int mid=(start+end)/2;
       	  // comparisons
       	  if(arr[mid]==search) {
       		  return  mid;
       		  		  
       	  }
       	  if(arr[mid]<search) {
       		  start=mid+1;
       	  }
       	  else {
       		  end=mid-1;
       	  }
         }        
        return -78;     
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          int arr[]= {30,32,54,58,98,99};
          int search=30;
              
          System.out.println("index for key is :"+binerys(arr,search));
	}

}
