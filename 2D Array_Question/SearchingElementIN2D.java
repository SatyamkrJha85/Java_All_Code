import java.util.Scanner;

public class SearchingElementIN2D {

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
	     System.out.println("enter your searching element");
	      int search=sc.nextInt();
	    for(int i=0;i<matrix.length;i++) {
	      for(int j=0;j<matrix.length;j++) {
	    		  if(matrix[i][j]==search) {
	    		  System.out.println("index at "+"("+i+","+ j+")");
	    		  }
	    		
		}
	     }
	     
	}

}
