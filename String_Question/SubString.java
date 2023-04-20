
public class SubString {
public static void substring(String str,int si,int ei) {
	String substr="";
	for(int i=si;i<ei;i++) {
		substr+=str.charAt(i);
	}
	System.out.println(substr);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String str="My name";
             substring(str,0,7);
           
             
             //using inbuilt function
          // System.out.println( str.subSequence(0, 3));
	}

}
