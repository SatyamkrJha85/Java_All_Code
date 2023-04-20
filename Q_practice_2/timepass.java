package satya;
import java.util.*;
public class timepass {

	public static void main(String[] args) {
		
		      int arr[]= {34,56,43,45,354};
		      int size=arr.length;
			for(int i=0;i<size;i++) {
				for(int j=0;j<size-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
	           for(int i=0;i<size;i++) {
	        	   System.out.println(arr[i]);
	           }
	           
		
	//	shorting using onle j loop
	           
	/*	int arr[]= {45,76,654,345,65,65,-87,-584,-78};
		for(int i=0;i<9;i++) {
			for(int j=0;j<9-i-1;j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<9;i++) {
			System.out.println(arr[i]);
		}
		*/
		// selection shot 
		/*
		int arr[]= {43,645,4544,5,454,4,45,-6645};
		 for(int i=0; i<arr.length; i++) {
	           int smallest = i;
	           for(int j=0; j<arr.length; j++) {
	        	  // smallest =j;
	               if(arr[j] > arr[smallest]) {
	                   smallest = j;
	                   int temp = arr[smallest];
	    	           arr[smallest] = arr[i];
	    	           arr[i] = temp;
	               }
	           }
	           
	       }

		
				for(int i=0;i<arr.length;i++) {
					System.out.println(arr[i]);
	}
				String bc="deepal,chodu,gandu,betichod";
				System.out.println(bc.replace(",", "\n")); */
		
		
		// Trnspose of matrix
		
		/* Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();
	 
	      int matrix[][] = new int[n][m];
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               matrix[i][j] = sc.nextInt();
	           }
	      }
	 
	      System.out.println("The transpose is : ");
	      //To print transpose
	      for(int j=0; j<m ;j++) {
	          for(int i=0; i<n; i++) {
	              System.out.print(matrix[i][j]+" ");
	          }
	          System.out.println();
	      }*/

}
}

