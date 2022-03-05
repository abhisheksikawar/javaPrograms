package ArrayPrograms;

import java.util.Arrays;

public class MinimizeTheHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,5,8,10};
		int l=arr.length;
		int k=2;
		int ans=getMinDif(arr,l,k);
		System.out.println((ans));

	}

	private static int getMinDif(int[] arr, int l, int k) {
		// TODO Auto-generated method stub
		
		Arrays.sort(arr);
		int min=arr[l-1]-arr[0];
		
		int small=arr[0]+k;
		int big=arr[l-1]-k;
		int temp=0;
		if(small>big) {
			temp=small;
			small=big;
			big=temp;
			
		}
		for(int i=1;i<l-1;i++) {
			int sub=arr[i]-k;
			int add=arr[i]+k;
			if(sub>=small||add<=big) {
				continue;
			}
			if(big-sub<=add-small) {
				small=sub;
			
		}
			else {
				big=add;
			}
		}
		return Math.min(min, big-small);
	}

}
