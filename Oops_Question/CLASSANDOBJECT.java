
public class CLASSANDOBJECT {
	public static void main (String args[]) {		
Pen p1=new Pen();
p1.setColour("black");
System.out.println("pen colour is :"+p1.colour);
p1.setTip(5);
System.out.println(p1.tip);


student s1=new student();
s1.setname("Satyam Jha");
System.out.println("MY name is "+s1.name);
s1.setroll(202);
System.out.println("roll is "+s1.roll);

satyam sa=new satyam();
sa.serdob(19);
System.out.println("date of day "+sa.DOB);
sa.setaddress("vI+POSt=Pohaddi");
System.out.println(sa.Address);
sa.setsection("k1");
System.out.println(sa.section);
sa.settrain(21021);
System.out.println(sa.train);
	}
}

class Pen{
	String colour;
	int tip;
	void setColour(String setColour) {
		this.colour=setColour;
	}
	void setTip(int setTip) {
		this.tip=setTip;
	}
}


class student{
	String name;
	int roll;
	void setname(String setname) {
		name=setname;
	}
	void setroll(int setroll) {
		roll=setroll;
	}
}


class satyam{
	int DOB;
	String Address;
	String section;
	int train;
    void serdob(int serdob) {
    	DOB=serdob;
    }
    void setaddress(String setaddress) {
    	Address=setaddress;
    }
    void setsection(String setsection) {
    	section=setsection;
    }
	void settrain(int settrain) {
		train=settrain;
	}
}