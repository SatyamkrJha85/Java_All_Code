
public class PalindromeInString {
	
	//real method
/*public static boolean palind(String str) {
	for(int i=0;i<str.length()/2;i++) {
		int n=str.length();
	if(str.charAt(i)!=str.charAt(n-1-i)){
			return false;
		}
	}
		return true;
	
}*/
	
	// bruteforce method
public static boolean palin(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=str.length()-1;i>=0;i--) {
			if(str.charAt(i)==str.charAt(j)) {
				return true;
				//System.out.println("Yes");
				
			}
			else {
				return false;
				//System.out.println("No");
			}
		}
	}
	//System.out.println(str);
	return false;
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               String str="ramar"; 
           //System.out.println(palind(str));
               System.out.println(palin(str));
              
	}

}
