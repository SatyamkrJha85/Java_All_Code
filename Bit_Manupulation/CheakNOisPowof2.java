
public class CheakNOisPowof2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=8;
        if((n&(n-1))==0) {
        	System.out.println("true");
        }
        else {
        	System.out.println("false");
        }
	}

}
