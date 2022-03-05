package ArrayPrograms;

import java.util.Arrays;

public class MergeWithoutExtraSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {1,4,7,9,10,13,14,15,16,17};
		int arr2[]=new int[] {1,2,5,8,10,11,12};
		int l1=arr1.length;
		int l2=arr2.length;
		int temp=0;
		for(int i=0;i<l1;i++) {
			if(arr1[i]>arr2[0]) {
				temp=arr1[i];
				arr1[i]=arr2[0];
				arr2[0]=temp;
				Arrays.sort(arr2);
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		

	}

}
