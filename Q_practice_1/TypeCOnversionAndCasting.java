package apnaCollefge;

public class TypeCOnversionAndCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Type conversion means we can store int to float but not store float to int : baecause float consume 
		 big ammount of data: */
		
          int a=43;
          float b= (int)a;
          System.out.println(b);
          byte c=45;
          int  d=c;
          System.out.println(d);
          
          
         
          // type casting:
          
          
          float s=45.45f;
          int w=(int)s;
          System.out.println(w);
          
          // char to int using ascii value:
          char s1='a';
          int r=s1;
          System.out.println(r);
          
	
	}

}
