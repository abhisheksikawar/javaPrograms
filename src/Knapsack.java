

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value[]= {60,150,100,120};
		int weight[]= {10,40,20,30};
		int bagSize=80;
		int profit=maximizeProfit(value,weight,4,bagSize);
		System.out.println(profit);
		

	}
	
	// choice 

	private static int maximizeProfit(int[] value, int[] weight, int n,int bagSize) {
		int sum=0;
		// TODO Auto-generated method stub
		if(n==0||bagSize==0) {
			return 0;
		}
		if(n>0&&weight[n-1]<=bagSize) {
			//System.out.println(sum);
			return max(value[n-1]+maximizeProfit(value, weight, n-1, bagSize-weight[n-1]),maximizeProfit(value, weight, n-1, bagSize));
			
		}
		else {
			return maximizeProfit(value, weight, n-1, bagSize);
		}
		
		
		//return 0;
	}

	private static int max(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println((a>b)?a:b);
		return (a>b)?a:b;
	}

}
