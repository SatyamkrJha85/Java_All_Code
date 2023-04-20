package apnaCollefge;

public class butterflyatterN {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		 public static void butterfly(int n) {
	    	  for(int i=1;i<=n;i++) {
	    		  // star
	    		  for(int j=1;j<=i;j++) {
	    			  System.out.print("*");
	    		  }
	    		  for(int j=1;j<=2*(n-i);j++) {
	    			  System.out.print(" ");
	    		  }
	    		  for(int j=1;j<=i;j++) {
	    			  System.out.print("*");
	    		  }
	    		  System.out.println();
	    	  }
	    	  for(int i=n;i>=1;i--) {
	    		  // star
	    		  for(int j=1;j<=i;j++) {
	    			  System.out.print("*");
	    		  }
	    		  for(int j=1;j<=2*(n-i);j++) {
	    			  System.out.print(" ");
	    		  }
	    		  for(int j=1;j<=i;j++) {
	    			  System.out.print("*");
	    		  }
	    		  System.out.println();
	    	  }
	      }
	      public static void main(String[] args) {
	    	  butterfly(5);
	      
		

	}

}
