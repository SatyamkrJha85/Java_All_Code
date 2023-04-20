package satyam.file;
import java.util.Scanner;
public class java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double n=sc.nextDouble();
double s=sc.nextDouble();
double poligon=(n*(s*s))/(4*Math.tan(Math.PI/n));
System.out.println(poligon);
	}

}
