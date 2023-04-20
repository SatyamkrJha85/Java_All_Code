
public class Inheritance {
public static void main(String args[]) {
	Dog1 s1=new Dog1();
	s1.barking();
	s1.breath();
	s1.Running();
	s1.bite();
	s1.length=90;
	s1.hight=43;
	System.out.println("length is "+s1.length);
	System.out.println("length is "+s1.hight);
}
}
	class Animal{
		int length;
		void breath() {
			System.out.println("This is breathing");
		}
		void Running() {
			System.out.println("He is running also");
		}
	}
	class Dog1 extends Animal {
		int hight;
		void bite() {
			System.out.println("bite also");
		}
		void barking() {
			System.out.println("he is barking ");
		}
	}