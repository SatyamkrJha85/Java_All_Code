
public class Questions {
public static void main(String args[]) {
	
	book b1=new book(342);
	book b2=new book(232);
	System.out.println(book.count);
	
	System.out.println("Q first ended");
	
	test t=new test();
	t.changeb();
	System.out.println(test.a+test.b);
System.out.println("Q second ended");

final car ca=new electriccar();
System.out.println(ca.drive());

System.out.println("Q third ended");
}
}
class book{
	int price;
	static int count;
	public book(int price) {
		this.price=price;
		count++;
	}
}

class test{
	static int a=10;
	static int b;
	static void changeb() {
		b=a*3;
	}
}

class automobile{
	private String drive() {
		return "driving vehicle";
	}
}
class car extends automobile{
	protected String drive() {
		return "driving car";
	}
}
 class electriccar extends car{
	public final String drive() {
		return "driving electric car";
	}
	
}
 
