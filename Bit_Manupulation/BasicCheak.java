
public class BasicCheak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5-101
		// 6-110
		// And of 5,6 is (5&6) (101&110= 100)
       System.out.println("And is "+(5&6));
       
            // 5-101
    		// 6-110
    		// OR of 5,6 is (5|6) (101|110= 111)
       System.out.println("or is "+(5|6));
       
       // 5-101
		// 6-110
		// XOR of 5,6 is (5|6) (101|110= 011)
  System.out.println("xor is "+(5^6));
  
    // 1's compliment of 5
    // 5-101
	
System.out.println("1's compimest of 5 is "+(~5));



         // Left Shift Left Shift Operator

           // Sign is <<
           //Q is 5<<2  5=0101
           //000101<<2 = 010100=20 in decimal value:

         System.out.println("\nQ of left shift operator\n");
         System.out.println((5<<2));
         //System.out.println((14<<3));
         System.out.println((11<<3));
              
         

         // Right Shift Right Shift Operator

           // Sign is >>
           //Q is 5>>2  5=0101
           //000101>>2 = 010100=1 in decimal value:

         System.out.println("\nQ of Right shift operator\n");
         System.out.println((5>>2));
         System.out.println((14>>3));
        System.out.println((11>>3));
        System.out.println((25>>3));
        System.out.println((1<<5));
        System.out.println((15&4));

	}

}
