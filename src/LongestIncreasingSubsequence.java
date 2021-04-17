
public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,3,4};
		int l=arr.length;
		int lis=getLongestIncreasingSubsequence(arr,l);
		System.out.println(lis);
	}

	private static int getLongestIncreasingSubsequence(int[] arr, int l) {
		// TODO Auto-generated method stub
		int runningMax=0;
		int max=0;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(arr[i]<arr[j]) {
					runningMax+=1;
				}
			}
			if(runningMax>max) {
				max=runningMax;
			}
			runningMax=0;
		}
		return max;
	}
	

}
