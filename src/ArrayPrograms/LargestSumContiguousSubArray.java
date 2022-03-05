package ArrayPrograms;

public class LargestSumContiguousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {-1,2,3,-4,5,6,-7,8,9};
		int l=arr.length;
		int currSum=0;
		int sum=0;
		for(int i=0;i<l;i++) {
			currSum=currSum+arr[i];
			
			if(currSum>sum) {
				sum=currSum;
				System.out.println(sum);
				
			}
			if(currSum<0) {
				currSum=0;
			}
		}
		System.out.println(sum);
		

	}

}
