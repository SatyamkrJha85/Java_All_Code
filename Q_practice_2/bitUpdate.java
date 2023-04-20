package satyam.file;
import java.util.scanner;
public class bitUpdate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
 int oper=sc.nextInt();
int n=5;
int pos=1;
int bitmask=1<<pos;
if(oper==1) {
	int newnumber=bitmask | n;
	System.out.println(newnumber);
}
else {
	int newbitmask=~(bitmask);
	int newnuber=newbitmask & n;
	System.out.println(newnumber);
}
	}

}
