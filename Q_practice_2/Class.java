package satya;
import java.util.*;
public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {43,453,434};
        // Scanner sc=new Scanner(System.in);
        //// System.out.println("enter a element of an array");
        // for(int i=0;i<5;i++) {
       // 	// a[i]=sc.nextInt();
      //   }
         for(int i=0;i<a;i++) {
        	 for(int j=i+1;j<a;j++) {
        		 if(a[i]>a[j]) {
        			 int temp=a[i];
        			 a[i]=a[j];
        			 a[j]=temp;
        		 }
        	 }
         }
         for(int i=0;i<a;i++) {
        	 System.out.print(a[i]+ " ");
         }
	}

}
