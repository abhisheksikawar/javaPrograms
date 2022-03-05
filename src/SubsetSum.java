
public class SubsetSum {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubsetSum subsetSum=new SubsetSum();
		int arr[]=new int[] {1,2,4,5,7,8,9};
		System.out.println(subsetSum.sum(arr,7,12));
		
	}

	private boolean sum(int[] arr, int n, int sum) {
		// TODO Auto-generated method stub
		if(sum==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		if(arr[n-1]>sum) {
			return sum(arr,n-1,sum);
		}
		
		return sum(arr,n-1,sum)||sum(arr,n-1,sum-arr[n-1]);
	}
	

}
