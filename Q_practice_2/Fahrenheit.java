package satya;
import java.util.*;
public class Fahrenheit {
	public static double fah(double x) {
		  double fah=(x*(9.0/5.0)+32);
		 return fah;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter your celcius value");
       double cel=sc.nextDouble();
       //double fah=(cel*(9.0/5.0)+32);
       System.out.println("your fahrenheit value:");
       System.out.println(fah(cel));
       
       
	}

}
