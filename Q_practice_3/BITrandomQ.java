package satyam.file;
import java.util.Scanner;
import java.util.scanner;
public class BITrandomQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
     int  num=sc.nextInt();
      //   int a=5;
     if((num != 0) && ((num &(num - 1)) == 0)) {
         System.out.println("\n%d is a power of 2"+ num);}

      else {
         System.out.println("\n%d is not a power of 2\n"+ num);}

	}

}
