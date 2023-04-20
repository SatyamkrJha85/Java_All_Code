package satya;

import java.util.Arrays;

public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.out.println("array shorting");
int[]arr= {45,98,14,01,235};
bubble(arr);
System.out.println(Arrays.toString(arr));
//System.out.println(arr.length);
}
	
	static void bubble(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
				
	}
}
