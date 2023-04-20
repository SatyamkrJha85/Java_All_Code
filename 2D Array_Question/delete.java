import java.util.*;
public class delete {
	
	public static void main(String[] args) {
		/*Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		

	    //  StringTokenizer st1 = new StringTokenizer("Hi! I am good. How about you?");
	      StringTokenizer st1 = new StringTokenizer(s);
	      

	      for (int i = 1; st1.hasMoreTokens(); i++) {
	         System.out.println("Token "+i+":      "+st1.nextToken());
	      }*/
		  Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        scan.close();
	        
	        s = s.trim(); // so that .split() works properly       	      
	        if (s.length() == 0) {
	            System.out.println(0);
	            return;
	        }	       
	        String [] words = s.split("[^a-zA-Z]+");        
	        System.out.println(words.length);
	        for (String word : words) {
	            System.out.println(word);
	        }

	}
}

