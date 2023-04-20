
public class ExponentialCode {
    public static void expo(int a,int n) {
    	int ans=1;
    	while(n>0) {
    		if((n&1)!=0) {
    			ans=ans*a;
    		}
    		a=a*a;
    		n=n>>1;
    	}
    	System.out.println(ans);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          expo(5,3);
          System.out.println(-~7);
	}

}
