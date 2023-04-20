
public class GettersANDSetters {
public static void main(String args[]) {
	
	Pen1 s=new Pen1();
   s.setColor("pink");
   s.setsize(6);
   System.out.println(s.getColor());
   System.out.println(s.getSize());
   s.setColor("black");
   System.out.println(s.getColor());
}
}
class Pen1{
	 private String colour;
	private int penSize;
	
	 String getColor() {
		 return this.colour;
	 }
	 void setColor(String newColor) {
		 this.colour=newColor;
	 }
	 int getSize() {
		 return this.penSize;
	 }
	 void setsize(int newsize) {
		 this.penSize=newsize;
	 }
	 
}

