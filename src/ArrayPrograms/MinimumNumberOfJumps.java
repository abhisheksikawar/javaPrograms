package ArrayPrograms;

public class MinimumNumberOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9,4,5,6,7,8,9,1,2,3,4,5,6,7,8} ;
		int l=arr.length;
		int dp[]=new int[l];
		dp[0]=0;
		for(int i=1;i<l;i++) {
			dp[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++) {
				if(i<=j+arr[j]&&dp[j]!=Integer.MAX_VALUE) {
					dp[i]=Math.min(dp[i], dp[j]+1);
					break;
				}
			}
		}
		System.out.println(dp[l-1]);

	}

}
