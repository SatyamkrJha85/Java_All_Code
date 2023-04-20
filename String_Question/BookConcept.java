import java.util.*;
public class BookConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String Object
		char c[]= {'j','a','v','a'};
		//System.out.println(c);
		String s1=new String(c);
		System.out.println("the main is :"+s1);
		String s2=new String(s1);
		System.out.println("store s1 value: "+s2);
		
		
		byte ascii[]= {65,66,67,68,69,70};
		String s3=new String(ascii);
		System.out.println(s3);
		String s4=new String(ascii,2,3);   //2,1 means 2+1=3 (66 to 67)
		System.out.println(s4);
		
		
	      //you can perform any strig funtion in println section:
	       System.out.println("osidsfsffjjdsf".compareTo(s4));
	       
	       
	       
	       // String concatenation in book style:
	       
	      String s="sayaan";
	      String sk="bawla "+s+" history";
	      System.out.println(sk);
	      
	   
	      
	      //concatenation in other datatype:
	      
	      float sp=45;
	      String se="bawla "+sp+" history";
	      System.out.println(se);
	      
	      String n="satya "+ 4+4;   //he just print the number not calculate
	      System.out.println(n);
	      
	      String sr="satya :"+(2+2*4);  //for calculating we use () this bracket
	      System.out.println(sr);
	      
	      //the Char At function use is he only print given index number :
	      String l="new sun rise";
	      System.out.println(l.charAt(8));
	      
	      //using of getChars function is he set the starting index to ending and print there value
	      String sae="the alpenlibe chocklet is very smoothing";
	      int start=0;
	      int end=20;
	      char bu[]=new char[end-start];
	      sae.getChars(start, end, bu, 0);
	      System.out.println(bu);
	    
	      // using of equal() and equalslgnorecase()   example below
	        
	      String dr="raman";
	      String dr2="raghav";
	      System.out.println(dr.equals(dr2));
	      System.out.println(dr.equalsIgnoreCase(dr2));
	      
	      // example of == operator
	      System.out.println(dr==dr2); //he work same but all time not currect
	      
	      
	      
	      // element index searching in String using indexof() and lastindexof() function
	      
	      String unic ="Now is the time for all good men "+"to come to the aid of their country";
	      System.out.println(unic);
	      
	      System.out.println("index of (0) is "+unic.indexOf('o'));
	      System.out.println("index of (y) is "+unic.lastIndexOf('y'));
	      System.out.println("index of (t) is "+unic.indexOf('t'));
	      System.out.println("last index of (t) is "+unic.lastIndexOf('t'));
	      System.out.println("last index of (the , 60) is "+unic.lastIndexOf("all",40));
	      
	      
	      // concat function in String :  uses is he store same variable and duplicate this 
	      
	      String p1="moz kardi";
	      String p2=p1.concat(p1);
	      System.out.println(p2);
	     
	      //replace function uses is he replace one word to another word:
	      
	      String p4="beti chona";
	      System.out.println(p4.replace("n", "d"));
	      
	      
	      // toUppercase keyword convert to uppercase letter :
	      System.out.println(p4.toUpperCase());
	      
	      // find length  in String using .length():
	      System.out.println("length is "+p4.length());
	       
	      
	      // reverse using String buffer 
	      
	      StringBuffer s5=new StringBuffer("newonebaby");
	      System.out.println(s5);
	     System.out.println(s5.reverse());
	     
	     // delete word using stringbuffer and .delete function:
	     System.out.println("delete element :"+s5.delete(2, 3));
	     
	     
	     
	     
	}

}
