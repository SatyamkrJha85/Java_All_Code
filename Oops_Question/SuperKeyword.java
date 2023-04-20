
public class SuperKeyword {
public static void main (String args[]) {
	donkey d=new donkey();
	System.out.println(d.col);
	System.out.println(d.a);

}
}
class Anil{
	String col;
    int a;  
	Anil(){
		System.out.println("i am a animal");
	}
}
class donkey extends Anil{
	donkey(){
		super();
		super.col="Yello";
		super.a=34;
		System.out.println("i am donkey");
	}
}
