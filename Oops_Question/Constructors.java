
public class Constructors {
public static void main(String args[]) {
	student2 s1=new student2("satya");
System.out.println(s1.name);
new student3();
student2 s4=new student2(23);
System.out.println(s4.rool);

}
}
class student2{
	String name;
	int rool;
	student2(String name){
		this.name=name;
		
	}
	// Parameterized constructor:
          student2(int roll){
        	  this.rool=roll;
          }
	}

	class student3{
		String name;
		//Non parameterized constructer:
		student3(){
			System.out.println("code is running");
		}
	}
	