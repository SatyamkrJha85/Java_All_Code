
public class BinarySearchIn2Darray {
	public static void diagonal(int arr[][],int search) {
		int row=0;
		int col=arr.length-1;
		while(row<arr.length && col>=0) {		
			if(arr[row][col]==search) {
				System.out.println(" index at ("+ row +","+ col+")");
				break;
			}
			else if(arr[row][col]>search) {
				col--;
			}
			else {
				row++;
			}
		}
	}
	public static void main(String[] args) {
		int matrix[][]= {{1,2,3,4},
		             {5,6,7,8},
		             {9,10,11,12},
		             {13,14,15,16}};
		int search=15;
             diagonal(matrix,search);
            
             
	}
}
