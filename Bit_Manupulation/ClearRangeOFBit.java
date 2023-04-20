
public class ClearRangeOFBit {
    public static void range(int bit,int i,int j) {
    	int a=((~0)<<(j+1));
    	int b=(1<<i)-1;
    	int bitmask=a|b;
    	int result=bit&bitmask;
    	System.out.println(result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int bit=10;
        int i=2;
        int j=4;
        range(bit,i,j);
	}

}
