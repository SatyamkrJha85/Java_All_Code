
public class CompareTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		String s1="satyam";
		String s2="satyam";
		if(s1==s2) {			
		System.out.println("character are same");

		}
		else {
		System.out.println("not same");
		}
		
		String s3=new String("Stark");
		String s4=new String("Stark");
		
		//using new function output giving perfect
		if(s3.equals(s4)) {			
			System.out.println("character are same");

			}
			else {
			System.out.println("not same");
			}
	}

}
