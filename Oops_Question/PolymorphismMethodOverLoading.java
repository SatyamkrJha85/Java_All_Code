
public class PolymorphismMethodOverLoading {
public static void main (String args[]) {
	calculator calc=new calculator();
	System.out.println(calc.sum(23, 45));
	System.out.println(calc.sum(23, 78,45));
	System.out.println(calc.sum((float)23.6, (float)45.7));
	System.out.println(calc.name("satya ","narayan"));
}
}
class calculator{
	int sum(int a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	float sum(float a,float b) {
		return a+b;
	}
	String name(String a,String b){
		return a+b;
	}
}