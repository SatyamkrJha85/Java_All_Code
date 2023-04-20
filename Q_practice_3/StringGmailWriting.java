package satyam.file;

import java.util.Scanner;

public class StringGmailWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         String gmail=sc.next();	
         String userName="";
         for(int i=0;i<gmail.length();i++) {
        	 if(gmail.charAt(i)=='@') {
        		/break;
        	 }
        	 else {
        		  userName += gmail.charAt(i);
        	 }
         }
         System.out.println(userName);
	}

}
