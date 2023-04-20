package satyam.file;

public class bitm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;  //0101
		int position=2;
		int bitmask=1<<position;
	     int newbitmask=~(bitmask);
		int  num=newbitmask & n;
		System.out.println(num);

	}

}
