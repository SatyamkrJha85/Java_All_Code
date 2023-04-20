import java.util.Scanner;

public class SmallestAndLargestIn2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int matrix[][]=new int [3][3];
	      Scanner sc=new Scanner(System.in);
	      for(int i=0;i<matrix.length;i++) {
	    	  for(int j=0;j<matrix.length;j++) {
	    		  matrix[i][j]=sc.nextInt();
	    	  }
	      }
	      for(int i=0;i<matrix.length;i++) {
	    	  for(int j=0;j<matrix.length;j++) {
	    		System.out.print(matrix[i][j]+" ");
		}
	    	  System.out.println();
	      }
	    
	      int largest=Integer.MIN_VALUE;
	      int smallest=Integer.MAX_VALUE;
	      for(int i=0;i<matrix.length;i++) {
	    	  for(int j=0;j<matrix.length;j++) {
	    		  if(matrix[i][j]>largest) {
	    			  largest=matrix[i][j];
	    		  }		  
	    		if(matrix[i][j]<smallest) {
	    			smallest=matrix[i][j];
	    		}
	    		
		}
	      }
	      System.out.println("largest is "+largest);
	      System.out.println("smallest is "+smallest);
	}

}
