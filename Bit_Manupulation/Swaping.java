
public class Swaping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int a=5;
           int b=7;
           System.out.println("before swaping "+a+" "+b);
           a=a^b;
           b=a^b;
           a=a^b;
           System.out.println("after swapping "+a+" "+b);
	}

}
