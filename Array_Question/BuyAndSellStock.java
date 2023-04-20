
public class BuyAndSellStock {
	public static void stock(int price[]) {
		int buyprice=Integer.MAX_VALUE;
		int maxprofit=0;
		
		for(int i=0;i<price.length;i++) {
			if(buyprice<price[i]) {
			   int profit=price[i]-buyprice;
			   maxprofit=Math.max(maxprofit, profit);
			}
			else {
				buyprice=price[i];
			}
		}
		System.out.println(maxprofit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //  int arr[]= {7,1,5,3,6,4};
		int arr[]= {7,6,4,3,1};
        stock(arr);
	}

}
