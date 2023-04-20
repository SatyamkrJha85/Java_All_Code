
public class AbstractClass {
public static void main(String args[]) {
	hourse s1=new hourse();
	s1.walk();
	s1.eat();
	chicken s2=new chicken();
	s2.eat();
	s2.walk();
}
}
abstract class Ani{
	void eat(){
		System.out.println("eating something");
	}
	abstract void walk();//Method 
}
class chicken extends Ani{
	void walk() {
		System.out.println("it have two legs");
	}
}
class hourse extends Ani{
	void walk() {
		System.out.println("it have four legs");
	}
}