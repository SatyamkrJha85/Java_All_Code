
public class ClearLastBit {
public static void clear(int bit,int pos) {
	int bitmask=(~0)<<pos;
	int result=bit&bitmask;
	System.out.println(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int bit=15;
          int pos=2;
          clear(bit,pos);
         
	}

}
