package satyam.file;

public class Bitmanu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;//0101
int position=3;
int bitmask=1<<position;
if((bitmask & n)==0) {
	System.out.println(bitmask);
	System.out.println("bitmask is zero");
}
else {
	System.out.println("bitmask is one");
}
	}
}
