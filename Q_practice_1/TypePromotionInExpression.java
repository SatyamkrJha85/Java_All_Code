package apnaCollefge;

public class TypePromotionInExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* type promo expression meaning
		 * char automatic change in int in expression case only 
		 * not a char any data type change in int to calculate and other expression:
		 */
		
		char a='a';
		char b='b';
	//	long c=98;
		char c='s'+'e';
		System.out.println('a');
     
		// making not sence but we can print there value 
		long r=43;
		char p='s';
		byte y=35;
		byte er=(byte)(r+p+y);
		System.out.println(er);
		
		
		// only run big datatype // we can't change double to int but we change int double to int :
		
		int e=34;
		double ut=45;
		float oi=34;
		double ere=e+ut+oi;
		System.out.println(ere);
		
		// example of typecast
		byte ytr=54;
		byte tr=(byte)(ytr*2);
		System.out.println(tr);
	}

}
