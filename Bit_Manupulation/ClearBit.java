
public class ClearBit {
	public static void ClearBit(int bit,int i) {
		int bitmask=~(1<<i);
		int result=(bit&bitmask);
		System.out.println("Changed Bit is : "+result);
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	// clear Bit means is we can clear that 1 bit of any position ex(1000101)and i=2 final is(1000001)
	       int bit=10;
	       int i=2;
	       ClearBit(bit,i);
	       ClearBit(90,6);
	       ClearBit(1377,5);
	       ClearBit(1342,4);
	       ClearBit(117,6);
	       
		}
}
