package apnaCollefge;
import java.util.Scanner;
public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int mark[]=new int[40];
      Scanner sc=new Scanner(System.in);
      mark[0]= sc.nextInt();
      mark[1]=sc.nextInt();
      mark[2]=sc.nextInt();
      System.out.println("phy :" + mark[0]);
      System.out.println("chem :" + mark[1]);
      System.out.println("math:" + mark[2]);

      
    int average=(mark[0]+mark[1]+mark[2])/3;
    System.out.println(average);
	}

}
