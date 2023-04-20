package myPack;

import java.util.Scanner;

public class powerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc= new Scanner(System.in);
      System.out.println("enter a value of base");
    		  int base =sc.nextInt();
    		  int temp=base;
     System.out.println("enter a valuue of expo");
     int expo=sc.nextInt();
     for(int i=1;i<expo;i++)
     {
    	 temp=temp*temp;
     }
    	 System.out.println("result of " + base+ " power " +expo+" is " +temp);
     
	}

}
