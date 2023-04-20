import java.util.*;
public class TrapedRainWater {
	public static void TrappedRainWater(int height[]) {
		int n=height.length;
		
		// Calculate left max boundary - array
		
		int leftmax[]=new int [n];
		leftmax[0]=height[0];
		for(int i=1;i<n;i++) {
			leftmax[i]=Math.max(height[i],leftmax[i-1]);
		}
		
		// calulate right max boundary -array		
		int rightmax[]=new int[n];
		rightmax[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			rightmax[i]=Math.max(height[i], rightmax[i+1]);
		}
		
		// main loop
		int trappedwater=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(leftmax[i], rightmax[i]);
			trappedwater=trappedwater+waterlevel-height[i];
		}
		System.out.println("Trapped Water is "+trappedwater);
		//return trappedwater;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int arr[]= {4,2,0,6,3,2,5};
//     Q2  //  int arr[]= {3,6,5,3,4,5,};
		//int arr[]= {5,4,6,8,9,5,3};
         //System.out.println(Water(arr));
         TrappedRainWater(arr);
	}

}
