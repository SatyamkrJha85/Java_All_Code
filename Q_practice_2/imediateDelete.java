package satya;

public class imediateDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {10,20,30,40,50};  
        int key = 30;  
        int last=arr.length-1;  
        int first =0;
        int mid = (first + last)/2;  
        while( first <= last ){ 
        	 mid = (first + last)/2; 
           if ( arr[mid] < key ){  
             mid = mid + 1;     
           }else if ( arr[mid]> key ){
             mid =mid-1;
             break;  
           }else{  
              System.out.println(mid);
           }  
          
        }
       
	}

}
