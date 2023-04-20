
package apnaCollefge;
import java.util.*;
public class CalculatorUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a value of A");
     int a=sc.nextInt();
     System.out.println("enter a value of B");
     int b=sc.nextInt();
     System.out.println("enter your operator");
     char operator=sc.next().charAt(0);
     switch(operator) {
     
     case '+': System.out.println(a+b);
     break;
     case '-': System.out.println(a-b);
     break;
     case '*': System.out.println(a*b);
     break;
     case '/': System.out.println(a/b);
     break;
     case '%': System.out.println(a%b);
     break;
     default: System.out.println("chutiya hai kya!");
     
     
     
     }
	
	}

}
