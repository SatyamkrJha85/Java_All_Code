
public class combinedCode {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// take input by user 
        //Scanner sc=new Scanner(System.in);
       //  String name=sc.nextLine();
        // System.out.println(name); 
         
         // direct print string
        // String satyam="myname is ";
        // System.out.println(satyam);
         
         /// use uppar comma to give some space
      //   System.out.println(lame);
      // how to add two sentence or name in string:
        // String name="satyam";
       //  String same="jha";
       //  String lame=name+ " "+same; 
         // print string length in java (length());
      //   System.out.println(lame.length());
         
         // how to print one by one string in java using (charAt)
       //  for(int i=0;i<lame.length();i++) {
        //	 System.out.println(lame.charAt(i));
        // }
          
         // how to compare two string in java (a1.compare(a2);
      //   if(name.compareTo(lame)==0) {
        	// System.out.println("string are equal");
      //   }
        // else
        // {
       // /	 System.out.println("string are not equal");
         //}
         // how to print  cut/shortcut method in java using name. subString
         
         //String satyam=name.substring(4,name.length());
      //   System.out.println(satyam);
        // String kumar=same.substring(2,same.length());
        // System.out.println(kumar);
         
         //Parse method of integer class
        // String str="123";
        // int number =Integer.parseInt(str);
        /// System.out.println(number);
        // System.out.println(str);
         
         //to string  method of string class(means find length)
         
         
        // int num=4590;
      //  String str=Integer.toString(num);
        // System.out.println(str.length());     
		
         String num ="satyam jha";
			System.out.println(num.toUpperCase());
			System.out.println(num.toLowerCase());
			System.out.println(num.length());
			System.out.println(num.charAt(4));
			System.out.println(num.substring(0, 5));
			System.out.println(num);
			System.out.println(num.startsWith("satya"));
			System.out.println(num.endsWith("jha"));
			System.out.println(num.replace("s", "i"));
			System.out.println(num.indexOf("y"));
		
			String a= "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG."; 
			  String reverse= new StringBuffer(a).reverse().toString();
			  System.out.println(reverse);
}
}