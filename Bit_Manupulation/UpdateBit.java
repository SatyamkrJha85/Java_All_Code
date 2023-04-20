
public class UpdateBit {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	// clear Bit means is we can clear that 1 bit of any position ex(1000101)and i=2 final is(1000001)
	       int oper=1;
	       int n=10;
	       int pos=2;
	       int bitmask=1<<2;
	       if(oper==1) {
	    	   int newnumber=bitmask|n;
	    	   System.out.println(newnumber);
	       }
	       else {
	    	   int newbitmask=~(bitmask);
	    	   int newnumber1=newbitmask&n;
	    	   System.out.println(newnumber1);
	       }
	       
		}
		
}
