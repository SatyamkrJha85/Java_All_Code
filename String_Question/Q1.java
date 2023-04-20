import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++) {
        	char ch=s.charAt(i);
      if(ch=='a'|| ch=='e'|| ch=='i'||ch=='0'||ch=='u') {  	
    	  count++;
      }
        }
        System.out.println("count of vowel is"+count);
	}

}
