package satyam.file;
import java.util.Scanner;
public class SurfaceOfEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc=new Scanner(System.in);
   System.out.println("enter x1 no");
     double x1=sc.nextDouble();
     System.out.println("enter x2 no");
     double x2=sc.nextDouble();
     System.out.println("enter y1 no");
     double y1=sc.nextDouble();
     System.out.println("enter y2 no");
     double y2 =sc.nextDouble();
     double earthRadius = 6371.01;
     double satya=earthRadius*math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y1 - y2));
     System.out.println(satya);
     double satya=earthRadius*math.acos
	}

}
