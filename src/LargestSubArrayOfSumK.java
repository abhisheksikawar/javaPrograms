
public class LargestSubArrayOfSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {4,1,1,1,2,3,5};
		int k=5;
		int i=0;
		int j=0;
		int max=0;
		int sum=0;
		int l=arr.length;
		while(j<l) {
			sum=sum+arr[j];
			//System.out.println(arr[j]);
			if(sum<k) {
				j++;
			}
			else if(sum==k) {
				if(max<j-i+1) {
					max=j-i+1;
				}
				j++;
			}
			else {
				while(sum>k&&i<l) {
					sum=sum-arr[i];
					i++;
					j++;
				}
			}
			
		}
		System.out.println(max);
}
}
