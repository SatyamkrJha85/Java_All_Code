package satyam.file;
import java.util.*;
public class bitCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //0101
		int pos=1;
		int bitmask=1<<pos;
		int newNumber=bitmask | n ;
		System.out.println(newNumber);

			
	}

}
