
public class ProfitMaximizationRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,9,8};
		int profit=maxizeProfit(arr,5,0);
		System.out.println(profit);

	}

	private static int maxizeProfit(int[] arr, int n,int profit) {
		// TODO Auto-generated method stub
		//int profit=0;
		int village=0;
		int currentProfit=0;
		int tempProfit=0;
		if(n==0) {
			return profit;
		}
		int k=n;
		village=n;
		currentProfit=arr[n];
		tempProfit=tempProfit+arr[n];
		while(k>=0) {
			 
			 if(village>k&&currentProfit%arr[k]==0) {
				 village=k;
				 currentProfit=arr[k];
				 tempProfit=tempProfit+arr[k];
					
			 }
			if(profit<tempProfit) {
				profit=tempProfit;
			}
			k--;
			
		}
		maxizeProfit(arr, n-1, profit);	
		
		return profit;
	}

}
