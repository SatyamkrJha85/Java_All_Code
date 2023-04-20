package satya;
import java.util.*;
public class PrimeOrNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int temp=0;
            for(int i=2;i<=n-1;i++) {
            	if(n%i==0) {
            		temp=temp+1;
            	}
	}
            if(temp==0) {
            	System.out.println("no is a prime");
            }
            else {
            	System.out.println("no not a prime");
            }

}
}