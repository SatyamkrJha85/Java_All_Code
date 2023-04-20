package satyam.file;

import java.util.Scanner;

public class ArrayQueBase {

	//*/public static void main(String[] args) {
		// TODO Auto-generated method stub
    //   Scanner sc=new Scanner(System.in);
      // System.out.println("enter your name:");
       //int size=sc.nextInt();
       //String name[]=new String [size];
     //  for(int i=0;i<size;i++) {
    	//   System.out.println("enter a name");
    	//   name[i]=sc.nextInt();
     //  }
     //  for(int i=0;i<name.length;i++) {
    	//   System.out.println("name " + (i+1) +" is : " + name[i]); *
	 public static void main(String args[]) {
	      Scanner sc = new Scanner(System.in);
	      int size = sc.nextInt();
	      String names[] = new String[size];
	 
	      //input
	      for(int i=0; i<size; i++) {
	          names[i] = sc.next();
	      }
	     
	      //output
	       for(int i=0; i<names.length; i++) {
	          // System.out.println("name " + (i+1) +" is : " + names[i]);
	    	   System.out.println(names[i]);
	       }
	      
	   }

}