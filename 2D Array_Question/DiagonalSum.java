
public class DiagonalSum {
	public static void diagonal(int matrix[][]){
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i==j) {
					sum+=matrix[i][j];
				}
				else if(i+j==matrix.length-1) {
					sum+=matrix[i][j];
			}
				
			}
			
		}
		System.out.println("first is "+sum);
	}

	// authentic way to solve this question
	public static void diagonal1(int matrix[][]){
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			//pd
			sum+=matrix[i][i];
			//sd
			if(i!=matrix.length-1-i);
	sum+=matrix[i][matrix.length-1-i];
		}
		System.out.println("2nd is " +sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{1,2,3,4},
      		             {5,6,7,8},
      		             {9,10,11,12},
      		             {13,14,15,16}};
		diagonal(matrix);
		diagonal1(matrix);
	}

}
