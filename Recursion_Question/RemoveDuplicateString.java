package Recursion;

public class RemoveDuplicateString {

	
	public static void duplicate(String str,int idx,StringBuilder newstr,Boolean map[]) {
		if(idx==str.length()) {
			System.out.println(newstr);
			return;
		}
		
		char currchar=str.charAt(idx);
		if(map[currchar-'a']==true) {
			//duplicate
			duplicate(str,idx+1,newstr,map);
		}
		else {
			map[currchar-'a']=true;
			duplicate(str,idx+1,newstr.append(currchar),map);
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="apnacollege";
           StringBuilder sb=new StringBuilder("");
           duplicate(str,0,sb,new boolean [26]);
	}
}
