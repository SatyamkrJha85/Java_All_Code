
public class PolymorphismMethodOverRiding {

	public static void main(String args[]) {
		cow s1=new cow();
		s1.eat();
	}
	}
	class animalt{
		void eat() {
			System.out.println("Eat anything");
		}
	}
	class cow extends animalt{
		void eat() {
			System.out.println("eat grass and rice");
		}
	}
