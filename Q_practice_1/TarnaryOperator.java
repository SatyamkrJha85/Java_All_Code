package apnaCollefge;

public class TarnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int a=11;
          String s=((a%2)==0)? "even": "odd";
          System.out.println("no is "+s);
          
          int b=10;
          String s1=((b%2)==0)? "even": "odd";
          System.out.println("no is "+s1);
          
          int s2=(b>5)? 10 : 5;
          System.out.println("Greater is "+s2);
          
          int mark=32;
          String result= mark>33?"pass": "fail";
          System.out.println("You are "+result);
	}

}
