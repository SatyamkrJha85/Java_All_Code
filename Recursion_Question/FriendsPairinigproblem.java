package Recursion;

public class FriendsPairinigproblem {
	public static int friendpair(int n)
	{
		if (n==1 || n==2) {
			return n;
		}
		//single
		int fnm1=friendpair(n-1);
		//pair
		int fnm2=friendpair(n-2);
		int pairway=(n-1)*fnm2;
		// way 
		int totway=fnm1+pairway;
		return totway;
		
	}
	public static int friendspair(int n)
	{
		if (n==1 || n==2) {
			return n;
		}
	 return friendspair(n-1)+(n-1)*friendspair(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(friendpair(3));
		System.out.println(friendspair(3));

	}

}
