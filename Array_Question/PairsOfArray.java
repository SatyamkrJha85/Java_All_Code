import java.util.*;
public class PairsOfArray {

	public static void pairs(int arr[]) {
		int  tp=(arr.length)*(arr.length-1)/2; // Formula Of total pair is n*n-1/2
		//int tp=0;
		for(int i=0;i<arr.length;i++) {// 2,4,6,8,10
			//int pair=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			//	tp++;
			}
			System.out.println();
		}
		System.out.println("Total Pair = "+tp);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc=new Scanner(System.in);
            System.out.println(" enter array size");
            int size=sc.nextInt();
            System.out.println("enter array element");
            int arr[]=new int [size];
            for(int i=0;i<size;i++) {
            	arr[i]=sc.nextInt();
            }
            pairs(arr);
	}

}


