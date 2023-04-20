package satya;
import java.util.*;
public class lslf {
	public static int search(int size,int array[],int item) {
		
		 int  first = 0;
	      int last = size;
	

	      while( first <= last )
	      {
	    	  int  middle = (first + last)/2;

	         if ( array[middle] == item )
	         {
	          return middle;
	           
	         }
	         if ( array[middle] < item ) {
		           first = middle + 1;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	        
	      }
	      return -1;
	     
	}
	   
	
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		Scanner sc= new Scanner(System.in);
    		System.out.println("enter your array no");
    	    int n=sc.nextInt();
    		int arr[]=new int [n];
    	    System.out.println((" enter your array element "));
    		for(int i=0;i<n;i++) {
    			 arr[i]=sc.nextInt();
    		}	
             System.out.println("enter your searching element");
             int search=sc.nextInt();
          System.out.println(search(n,arr,search));
    	}
    }
