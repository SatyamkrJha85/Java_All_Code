import java.util.Scanner;
public class delet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=5;
		//value(d);
		System.out.println(value(d));
		dec(d);
		System.out.println("The value of d is "+sec(d));
		
		int arr[]= {1,2,3,4,5,3,8};
		int key=8;
		System.out.println("your array return : "+ sorted(arr,0));
		System.out.println("the index is :"+ index(arr,key,0));
      
	}


public static int value(int b) {
	if(b>0) {
		return b+value(b-1);
	}
	else {
		return 0;
	}
}
public static void dec(int c) {
	if(c==1) {
		System.out.println(1);
		return ;
	}
	else {
		System.out.println(c);
		dec(c-1);
	}
}
public static int sec(int k) {
	if(k==1) {
		return 1;
	}
	int sur=sec(k-1);
	int s=k+sur;
	return s;
	
}

// Cheak the array is sorted or not 
public static boolean sorted(int arr[],int i) {
	if(i==arr.length) {
		return true;
	}
	if(arr[i]>arr[i+1]) {
		return false;
	}
	return sorted(arr,i+1);
}

//Find the index of the array 

public static int index(int arr[],int key,int i) {
	if(i==arr.length) {
		return -1;
	}
	if(key==arr[i]) {
		return i;
	}
	return index(arr,key,i+1);
}
}