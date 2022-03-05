
public class KadanesAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {-2,-3,4,-1,-2,1,5,-3};
		int tempSum=0;
		int sum=0;
		int l=arr.length;
		for(int i=0;i<l;i++) {
			tempSum=tempSum+arr[i];
			if(sum<tempSum) {
				sum=tempSum;
			}
			if(tempSum<0) {
				tempSum=0;
			}
		}
		
		System.out.println(sum);

	}

}
