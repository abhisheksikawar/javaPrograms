package ArrayPrograms;

import java.util.Arrays;

public class UnionAndIntersectionOfArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]=new int[] {2,6,9,3,7,12,8};
		int arr2[]=new int[] {1,2,4,5,6,8,10,12};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int union[]=new int[arr1.length];
		int intersection[]=new int[arr2.length];
		int i=0;
		int j=0;
		int x=0;
		int y=0;
		while(i<arr1.length) {
			if(arr1[i]==arr2[j]) {
				union[x++]=arr1[i];
				i++;
				j++;
			}else if(arr1[i]>arr2[j]) {
				intersection[y++]=arr2[j];
				j++;
			}else if(arr1[i]<arr2[j]) {
				intersection[y++]=arr1[i];
				i++;
			}
		}
		while(j<arr2.length) {
			intersection[y++]=arr2[j];
			j++;
		}
		System.out.println(Arrays.toString(union));
		System.out.println(Arrays.toString(intersection));

	}

}
