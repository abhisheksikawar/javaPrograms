import java.util.ArrayList;
import java.util.Arrays;

public class LargestSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,-2,-3,-4};
		ArrayList<Integer> al=new ArrayList<>();
		int l=arr.length;
		int currentSum=0;
		int j=0;
		int actualSum=Integer.MIN_VALUE;
		for(int i=0;i<l;i++) {
			currentSum=arr[i]+currentSum;
			if(actualSum<currentSum) {
				actualSum=currentSum;
				al.add(arr[i]);
			}
			if(currentSum<0) {
				currentSum=0;
			}
			
		}
		System.out.println(actualSum+ al.toString());
	}

}
