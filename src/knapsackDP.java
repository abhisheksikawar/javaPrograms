import java.util.Arrays;

public class knapsackDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]= {60,150,100,120};
		int weight[]= {10,40,20,30};
		int bag=80;
		int max=maxProfit(value,weight,bag,4);
		System.out.println(max);

	}

	private static int maxProfit(int[] value, int[] weight, int bag, int n) {
		// TODO Auto-generated method stub
		int dp[][]=new int[n+1][bag+1];
		
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<bag+1;j++) {
				if(i==0||j==0) {
					dp[i][j]=0;
				}
			}
		}
		
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<bag+1;j++) {
				if(weight[i-1]<=j) {
					dp[i][j]=max(value[i-1]+dp[i-1][j-weight[i-1]],dp[i-1][j]);
					
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<bag+1;j++) {
				
					System.out.print(dp[i][j]+" ");
				
			}
			System.out.println("");
		}
		return dp[n][bag];
	}
	static int max(int a,int b){
		//System.out.println((a>b)?a:b);
		return (a>b)?a:b;
		
	} 

}
