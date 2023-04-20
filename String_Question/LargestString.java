 import java.util.*;
 public class LargestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String fruit[]= {"apple","orange","papaya","pineapple"};
         String largest =fruit[0];
         for(int i=0;i<fruit.length;i++) {
        	 if(largest.compareTo(fruit[i])<0) {
        		 largest=fruit[i];
        	 }
         }
         
         System.out.println(largest);

	}

}
