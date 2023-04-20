package apnaCollefge;
import java.util.*;
public class FunctionCodeDemo {
	/*public static void satyam() {
		for(int i=0;i<=24;i++) {
			System.out.println(i);
		}
		int sum=0;
		for(int i=0;i<=10;i++) {
			 sum=sum+i;
			System.out.println(sum);
		}
		System.out.println(" ");
		
		int a=90,b=34;
		System.out.println(a+b);
		System.out.println("satyam jha");
	
	} */
/*	public static int  sum(int a, int b) {
		int sum;
		sum=a+b;
		//System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {				
       //  satyam();       
		
         Scanner sc=new Scanner(System.in);
         System.out.println("enter a value of x");
         int x=sc.nextInt();
         System.out.println("enter a value of y");
         int y=sc.nextInt();
       System.out.println("your sum is :"); 
         // int sum=satyam(x,y);
		//int x=34,y=35;
     sum(x,y);
     System.out.println(sum(x,y));
        
	} */ /*
	   public static int   mul(int e,int r) {
		   int mum=e+1+r;
		  
		  return mum;
	   }
	public static void main(String[] args) {
          int a=9;
          int b=9;
         int prob= mul(a,b);
         int prob1=mul(43,56);
         System.out.println(prob);
         System.out.println(prob1);
	}*/
	 public static int   mul(int a) {
		 int fact=1;
		 for(int i=1;i<=a;i++) {
			 fact=fact*i;
			// System.out.println(fact);
		 }
		  
		 // System.out.println(fact);
		 return fact;
		 
	   }
	public static void main(String[] args) {
        int b=5;
      //mul(b);
      System.out.println(mul(b));
	}
}
