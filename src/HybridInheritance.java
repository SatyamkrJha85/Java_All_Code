
public class HybridInheritance {
public static void main(String args[]) {
	Animals s1=new Animals();
	s1.breath();
	fish s2=new fish();
	s2.swim();
	whale s3=new whale();
	s3.dangerious();
	////And so on:
	s3.swim();
}
}
class Animals{
	void breath() {
		System.out.println("breething");
	}
}
class fish extends Animals{
	void swim() {
		System.out.println("swimming");
	}
}
class whale extends fish{
	void dangerious() {
		System.out.println("dengerious");
	}
}
class shark extends fish{
	void todanger() {
		System.out.println("very danger fish");
	}
}
class bird extends Animals{
	void flying() {
		System.out.println("flying ");
	}
}
class crow extends bird{
	void black() {
		System.out.println("colour is black");
	}
}
class peacock extends bird{
	void feature() {
		System.out.println("its a beautiful bird");
	}
}
class mamels extends Animals{
	void walk() {
		System.out.println("they are walking");
	}
}
class Dog extends mamels{
	void bark() {
		System.out.println("barking");
	}
}
class cat extends mamels{
	void milk() {
		System.out.println("drinking water");
	}
}
class human extends mamels{
	void speak() {
		System.out.println("they speak very well");
	}
}