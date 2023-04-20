
public class AcessModifier {
//in acess modifier we have four types of modifier public,private,default,protected:
	// we use these four types of modifier to create any types of program
	public static void main(String args[]) {
		bank s=new bank();
		s.satya(45);
		
		// uset can not see under of bank variable or any detail because they are private user only change the value 
		// not see in under s.satya: 
		System.out.println("");
	}
}

// create a class name is bank 
// under the variable name a is private type:

class bank{
	private int a=90;
	void satya(int satya) {
		a=satya;
	}
}