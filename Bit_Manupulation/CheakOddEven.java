
public class CheakOddEven {
public static void Oddeven(int a) {
	int bitmask=1;
	if((a & bitmask)==0){
		System.out.println("Bit is Even ");
	}
	else {
		System.out.println("Bit is Odd ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int bit=4;
          int bit2=5;
          Oddeven(bit);
          Oddeven(bit2);
          Oddeven(46);
	}

}
