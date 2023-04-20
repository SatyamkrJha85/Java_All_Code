package satyam.file;
import java.util.Scanner;
public class unkoue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			//public static void main(String[] args) {
				// TODO Auto-generated method stub
		      Scanner sc= new Scanner(System.in);
		      System.out.println("enter a value of base");
		    		  int base =sc.nextInt();
		    		  int temp=base;
		     System.out.println("enter a valuue of n");
		     int n=sc.nextInt();
		     for(int i=1;i<n;i++)
		     {
		    	 temp=temp*temp;
		     }
		    	 System.out.println("result of " + base+ ""
		    	 		+ " power " +n+" is " +temp);
		     
			}

		}

