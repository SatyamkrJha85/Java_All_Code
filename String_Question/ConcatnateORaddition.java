import java.util.*;

public class ConcatnateORaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str="The Fox And Frog In Forest";
          String str2=" And they lived in same cave";
          String concatnate=str+str2;
          System.out.println(concatnate);
          
          //same thing taking input by user:
          
          Scanner sc=new Scanner(System.in);
          System.out.println("enter first message");
          String one=sc.nextLine();
          System.out.println("enter second message");
          String two=sc.nextLine();
          System.out.println("concatnate is :");
          System.out.println(one+two);
          
	}

}
