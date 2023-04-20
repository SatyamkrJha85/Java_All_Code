package apnaCollefge;
import java.util.*;
public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("enter your no");
  int n=sc.nextInt();
  int sum=0;
  int sum2=0;
  if(n%2==0) {
	sum=sum+n;
	}
  else {
	  sum2=sum2+n;
  }
  System.out.println(sum);
  System.out.println(sum2);
  }

}
