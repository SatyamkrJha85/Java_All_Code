package apnaCollefge;
import java.util.*;
public class ArrayFunc {
	public static void update(int marks[]) {
		for(int i=0;i<=marks.length;i++) {
			marks[i]=marks[i]+1;
		}
	}
	public static void main(string args[]) {
		int marks[]= {23,56,78 ,97,67};
		update(marks);
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]+" ");
		}
		System.out.println();
	}
}