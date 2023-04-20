package satyam.file;

public class bitQu {

	public static void main(String[] args) {
		
		/// Bit on code:
      //  int n=228;// 11100100
      //  int pos=1;
       // int bitmask=1<<pos;
       // int newnumber=n | bitmask;
       // System.out.println(newnumber);
        
        // toogle bit code:
		
      //  int n=165; // 01010110
      //  int pos=7;
      //  int bitmask=1<<pos;
      //  int newnumber=(n ^ bitmask);
     //   System.out.println(newnumber);
		
		// off bit
		
		//int n=214; //11010110
		//int pos=4;
		//int bitmask=1<<pos;
		//int newnumber=n&bitmask;
		//System.out.println(newnumber`);
		
		// cheak bit number:
		int n=214;//11010110
		int pos=6;
		int bitmask=1<<pos;
		int newnumber=bitmask&n;
		if((bitmask&n)==0) {
			System.out.println(newnumber);
			System.out.println("number is zero");
		}
		else {
			System.out.println("no is one");
		}
        
	}

}
