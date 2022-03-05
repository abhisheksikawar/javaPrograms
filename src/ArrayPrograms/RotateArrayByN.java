package ArrayPrograms;

import java.util.Arrays;

public class RotateArrayByN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Note: Above problem can also be solved using a temp array.shift the elements by k and then add the temp arr
		int arr[]=new int[] {2,3,4,5,6,7,8};
		int temp;
		int n=4;
		int l=arr.length;
		for(int i=0;i<n;i++) {
			temp=arr[l-1];
			for(int j=l-2;j>=0;j--) {
				arr[j+1]=arr[j];
			}
			arr[0]=temp;
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
