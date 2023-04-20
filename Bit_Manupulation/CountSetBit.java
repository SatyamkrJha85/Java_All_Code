
public class CountSetBit {
public static void bit(int Bit) {
	int count=0;
	while(Bit>0) {
		if((Bit&1)!=0) {
			count++;
		}
		Bit=Bit>>1;
	}
	System.out.println(count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int bit=15;
          bit(bit);
	}

}
