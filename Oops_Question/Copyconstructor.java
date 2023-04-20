
public class Copyconstructor {
public static void main(String args[]) {
 student4 s1=new student4();
s1.name="satyam";
s1.roll=89;
s1.password="skjha";
s1.mark[0]=90;
s1.mark[1]=34;
s1.mark[2]=67;
for(int i=0;i<3;i++) {
	System.out.println(s1.mark[i]);
}
System.out.println(s1.password);
System.out.println(s1.name);


student4 s2=new student4(s1);

/*
s2.mark[0]=43;
s2.mark[1]=34;
s2.mark[2]=45;
*/
s1.mark[0]=43;
s1.mark[1]=34;
s1.mark[2]=45;
for(int i=0;i<3;i++) {
	System.out.println(s2.mark[i]);
}
s2.password="satyaji";
System.out.println(s2.password);
s2.name="raftaar";
System.out.println(s2.name+" "+s1.name);
}
}
class student4{
	int roll;
	String password;
	String name;
	int mark[];
	//And it is a also normal copy constructor:
	//Shallow copy constructor: its mean not reflect any value
  /*student4(student4 s1){
	  mark=new int[3];
	this.name=s1.name;
	this.roll=s1.roll;
	this.password=s1.password;
	this.mark=s1.mark;
}
*/
	//Deep constructor:
	student4(student4 s1){
		  mark=new int[3];
		this.name=s1.name;
		this.roll=s1.roll;
		this.password=s1.password;
		for(int i=0;i<mark.length;i++) {
			this.mark[i]=s1.mark[i];
		}
	}
	
 student4() {
	//// TODO Auto-generated constructor stub
	  mark=new int[3];
}
}