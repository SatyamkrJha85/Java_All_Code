package apnaCollefge;

public class FunctionOverloading {
	// mul of two no
	public static int mul(int a,int b) {
		return a*b;
	}
	// mul of three no
	public static int mul(int a,int b,int c) {
		return a*b*c;
	}
	// mul of four no using different datatype
	
   public static float  mul(float a,float b,float c,float d) {
	   return a*b*c*d;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             System.out.println(mul(4,2));
             System.out.println(mul(6,3,6));
             System.out.println(mul(4.0f,12.0f,2.1f,4.6f));
	}

}
