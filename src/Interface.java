
public class Interface {
public static void main(String args[]) {
	Queen q1 =new Queen();
	q1.moves();
	rooks r1 = new rooks();
	r1.moves();
	King k1=new King();
	k1.moves();
	
	A7 a=new A7();
	a.print();
	a.show();
	saty sk=new saty();
	sk.news();
	sk.kay();
	sk.news1();
}
}
interface chessplayer{
	void moves();
}
class Queen implements chessplayer{
	public void moves() {
		System.out.println("up , down , right , diagonal");
	}
}
class rooks implements chessplayer{
	public void moves() {
		System.out.println("up , down , right");
	}
}
class King implements chessplayer{
	public void moves() {
		System.out.println("up , down , right , diagonal(by 1 step)");
	}
}

//multiple interface
interface printable{
	void print();
}

interface showable{
	void show();
}

class A7 implements printable,showable{
	public void print() {
		System.out.println("hello");
	}
	public void show() {
		System.out.println("welcome");
	}
}

interface satya{
	void news();
}
interface jha{
	void news1();
		
}
class saty implements satya,jha{
	void kay() {
		System.out.println("hey man");
	}
	public void news() {
		System.out.println("they are awesome");
	}
	public void news1() {
		System.out.println("it is special");
	}
}