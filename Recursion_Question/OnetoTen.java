package Recursion;
public class OnetoTen {
public static void main(String args[]) {
	int n=10;
	printdec(n);
	printinc(n);
}
public static void printdec(int n) {
	if(n==1) {
		System.out.println(1+" ");
		return ;
	}
	System.out.println(n+" ");
	printdec(n-1);
}
public static void printinc(int n) {
	if(n==1) {
		System.out.println(1);
		return ;
	}
	printinc(n-1);
	System.out.println(n);
}
}
