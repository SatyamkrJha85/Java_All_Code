
public class NonREpeatingNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {4,3,4,3,6,7,7,6,9};
         int sum=0;
         for(int i=0;i<arr.length;i++) {
        	 sum=sum^arr[i];
         }
         System.out.println(sum);
	}

}
