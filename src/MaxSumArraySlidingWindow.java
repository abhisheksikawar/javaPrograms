
public class MaxSumArraySlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,11,12,13,14,15};
		int l=arr.length;
		int k=4;
		int i=0,j=0;
		int sum=0,max=0;
		while(j<l) {
			sum=sum+arr[j];
			if(j-i+1<k) {
				
				j++;
			}
			else if(j-i+1==k) {
				max=sum;
				System.out.println(max);
				sum=sum-arr[i];
				i++;
				j++;
				
				
			}
		}
		

	}

}
