
public class ShortestPath {
	public static void  path(String str) {
		int x=0;
		int y=0;
		for(int i=0;i<str.length();i++) {
			char dir=str.charAt(i);
			
			//south
			if(dir=='S') {
				y--;
			}
			//north
			 else if(dir=='N') {
				y++;
			}
			//west 
			else if(dir=='W') {
				x--;
			}
			//east
			else {
				x++;
			}
		}
			//formula (x2-x1)^2 + (Y2-Y1)^2 
			
			int x2=x*x;
			int y2=y*y;
			float result =(float )Math.sqrt(x2+y2);
			System.out.println(result);
	           
			//return (float)Math.sqrt(x2+y2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		String str="ENSWESN";
		path(str);
		//System.out.println(path(str));
	}

}
