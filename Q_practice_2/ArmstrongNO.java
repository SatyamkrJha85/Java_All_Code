package satya;
import static java.lang.math.sqrt;
public class ArmstrongNO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=153;
     int temp;
     int armstrong=0;
     int original=n;
     while(n>0) {
    	 temp=n%10;
    	 temp=math.pow(temp,3);
    	 armstrong=armstrong+temp;
    	 n=n/10;
     }
     if(armstrong==original) {
    	 System.out.println("armstrong");
     }
     else {
    	 System.out.println("not");
     }
	}

}
