
public class SetBit {
public static void SetBit(int bit,int i) {
	int bitmask=(1<<i);
	int result=(bit|bitmask);
	System.out.println("Changed Bit is : "+result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int bit=10;
       int i=2;
       SetBit(bit,i);
       SetBit(90,5);
       SetBit(1377,7);
       SetBit(1342,6);
       SetBit(117,3);
       
	}

}
