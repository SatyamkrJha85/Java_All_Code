package satyam.file;
import java.util.Scanner;

public class CircleFunction {
	public static double satyam(double x){
		return 2 * 3.14 * x;

	}

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a  number");
       double r =sc.nextInt();
       System.out.println(satyam(r));
     
}
}