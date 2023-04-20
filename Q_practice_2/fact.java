package satya;
import java.util.*;
public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=5;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
           int a=0;
           int b=1;
           System.out.println(a+""+b);
           int c;
            for(int i=1;i<=n;i++) {
            	c=a+b;
            	System.out.println(""+c);
            	a=b;
            	b=c;
            }
}
}