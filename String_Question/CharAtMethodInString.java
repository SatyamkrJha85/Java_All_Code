import java.util.*;
public class CharAtMethodInString {
	public static void method(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String str="Satya";
            String str2="Jha";
            String str3=str+str2;
            System.out.println(str3.charAt(4));
            method(str3);
	}

}
