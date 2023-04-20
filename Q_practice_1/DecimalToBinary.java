package apnaCollefge;

public class DecimalToBinary {

	//public class DesimalToBinary {
		public static void bin(int binary) {
			int  pow=0;
			int  denum=0;
			while(binary>0) {
				int  lastdigit=binary%10;
				denum=denum+(lastdigit *(int)Math.pow(2, pow));
				pow++;
				binary=binary/10;
			}
		
			System.out.println("decimal of "+ binary +" = "+denum);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	           bin(010);
	          
	           System.out.println(Integer.parseInt("101",2));  
		}


}
