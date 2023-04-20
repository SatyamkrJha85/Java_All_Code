
public class GetithBit {
public static void getbit(int bit,int i) {
	int bitmask=(1<<i);
	if((bit&bitmask)==0) {
		System.out.println("bit is 0");
	}
	else {
		System.out.println("Bit is 1 ");
	}
	int mask=bit&bitmask;
	System.out.println(mask);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int bit=14;
         int i=2;
         
         
         getbit(bit,i);
        getbit(17718,14);
        getbit(3926,6);
	}

}
