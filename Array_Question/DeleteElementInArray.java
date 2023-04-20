import java.util.*;
public class DeleteElementInArray {
	public static void delition(int arr[],int size, int pos) {
		System.out.println("Before delition \n");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(int i=pos;i<size-1;i++) {
			arr[i]=arr[i+1];
		}
		System.out.println("After delition ");
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      System.out.println("enter your size");
      int size=sc.nextInt();
      System.out.println("Enter your array element");
      int arr[]=new int[size];
      for(int i=0;i<size;i++) {
    	  arr[i]=sc.nextInt();
      }
      System.out.println("Enter your position");
      int pos=sc.nextInt();
      delition(arr,size,pos);
      
      
	}

}

