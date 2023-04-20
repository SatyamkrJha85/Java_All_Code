package satyam.file;
import java.util.*;
public class ArrayBasica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);// scan 
		System.out.println("enter a raw ");
		int row=sc.nextInt();
		System.out.println("enter a col ");
		int col=sc.nextInt();
     int num[][]=new int [row][col];
     for(int i=0;i<row;i++) {
    	 for(int j=0;j<col;j++) {
    		 num[i][j]=sc.nextInt();
    	 }
    	 
     }
     int x=sc.nextInt();
     for(int i=0;i<row;i++) {
    	 for(int j=0;j<col;j++) {
    	if(num[i][j]==x) {
    		System.out.println("true");
    	}
    	else {
    		System.out.println("false");
    	}
    	//System.out.println(i);
     }
	}
	}
}
