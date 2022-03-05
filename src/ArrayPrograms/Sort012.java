package ArrayPrograms;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {2,1,0,2,0,1,2,2,0,0,1,0};
		int l=arr.length;
		int x=0;
		int y=0;
		int z=l-1;
		int temp=0;
		while(y<=z) {
			if(arr[y]==0) {
				temp=arr[x];
				arr[x]=arr[y];
				arr[y]=temp;
				x++;
				y++;
			}else if(arr[y]==1) {
				y++;
				
			}else if(arr[y]==2) {
				temp=arr[z];
				arr[z]=arr[y];
				arr[y]=temp;
				z--;
				
			}
			System.out.println(x+" "+y+" "+z);
			System.out.println(Arrays.toString(arr));
		}
		

	}

}
