
public class Multilevelinheritance {
  public static void main(String args[]) {
	  puppy2 s2=new puppy2();
	  s2.legs=2;
	  s2.total=34;
	  System.out.println("legs"+s2.legs);
	  System.out.println("total"+s2.total);
	  s2.setbreed("Zermansheferd");
	  System.out.println(s2.getbreed());
	  s2.running();
	  s2.colour();
	  s2.legs();
	  
	  
  }
}
class Animal23{
int legs;
void running() {
	System.out.println("He is running");
}
}
class Dog21 extends Animal23{
	String breed;
	String getbreed() {
		return this.breed;
	}
	void setbreed(String newBreed) {
		breed=newBreed;
	}
	void colour() {
		System.out.println("Black colour");
	}
}
class puppy2 extends Dog21{
	int total;
	void legs() {
		System.out.println("four legs");
	}
	
}