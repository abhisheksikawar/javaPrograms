package ArrayPrograms;

import java.util.Arrays;

public class SeparateNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,-1,-3,2,1,-3,-4,2,-9};
		int l=arr.length;
		int x=0;
		int y=l-1;
		int temp=0;
		while(x<=y) {
			if(arr[x]>0) {
				temp=arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
				y--;
			}else if(arr[x]<0) {
				x++;
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
