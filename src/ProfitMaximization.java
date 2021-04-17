
public class ProfitMaximization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,9,8};
		int profit=0;
		
		int l=arr.length;
		for(int i=l-1;i>=0;i--) {
			int village=0;
			int tempprofit=0;
			int currentProfit=0;
			
			for(int j=i;j>=0;j--) {
				if(i==j) {
					village=j;
					currentProfit=arr[j];
					tempprofit+=arr[j];
					
					
				}
				if(village>j&&currentProfit%arr[j]==0) {
					village=j;
					currentProfit=arr[j];
					tempprofit+=arr[j];
				}
				
			}
			if(profit<tempprofit) {
				profit=tempprofit;
			}
			
		}
		System.out.println(profit);

	}

}
