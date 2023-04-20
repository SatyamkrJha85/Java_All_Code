
public class HierarchialINheritance {
public static void main(String args[]) {
	Animals sc=new Animals();
	sc.breath();
	fish sc1=new fish();
	sc1.swim();
	human sc2=new human();
	sc2.walk();
	boy sc3=new boy();
	sc3.play();
}
}
class Animals{
	void breath() {
		System.out.println("breathings");
	}
}
class fish extends Animals{
	void swim() {
		System.out.println("swimming");
	}
}
class human extends Animals{
	void walk() {
		System.out.println("walking");
	}
}
class boy extends Animals{
	void play() {
		System.out.println("He is playing");
	}
}