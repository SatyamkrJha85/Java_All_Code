
public class StaticKeywords {
public static void main(String args[]) {
	studen s2=new studen();
	s2.name="satyam";
	s2.roll=202;
	s2.sec="k";
	s2.show();
	studen s3=new studen();
	s3.name="ritam";
	s3.roll=278;
	s3.sec="s";
	s3.show();
	
}
}

class studen{
	String name;
	int roll;
	String sec;
	void show() {
		System.out.println(name + ": "+ roll +" :"+ sec);
	}
}