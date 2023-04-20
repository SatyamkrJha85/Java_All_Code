package apnaCollefge;
import java.util.*;
public class ConditionalStatementQuesdtion {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//Write a Java program to get anumber from the user and print whether it is positive or negative
		/*
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your number");
       int a=sc.nextInt();
       if(a>0) {
    	   System.out.println("positive no");
       }
       else {
    	   System.out.println("negative no");
    	   }  */
		// Q is cheak a fever , temp is above in 100 you have fever:  
		
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your tempreture");
		int temp=sc.nextInt();
		if(temp>100) {
			System.out.println("you have fever please consult a doctor");
		}
		else {
			System.out.println(" detect not fever don't excuse");
		}  */
		
		// Q is Cheak a week using switch
		/*
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your no");
       int n=sc.nextInt();
       switch(n) {
       case 1: System.out.println("monday");
       break;
       case 2: System.out.println("tuesday");
       break;
       case 3: System.out.println("wednesday");
       break;
       case 4: System.out.println("thursday");
       break;
       case 5: System.out.println("friday");
       break;
       case 6: System.out.println("satarday");
       break;
       case 7: System.out.println("sunday ");
       break;
       default: System.out.println("aur kya chahiye lwde");
       }
       */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter yout year");
		int year=sc.nextInt();
		boolean x= (year%4) ==0;
		boolean y = (year%100) !=0;
		boolean z= ((year%100==0) && (year%400==0));
		if(x&&(y || z)) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
	}

}
