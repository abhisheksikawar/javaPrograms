import java.util.Arrays;
import java.util.Collections;

public class MinimizeTheHeightII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3, 9, 12, 16, 20};
		int l=arr.length;
		Arrays.sort(arr);
		int temp=0;
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<l/2;i++) {
		arr[l-1-i]-=3;
		arr[i]+=3;
		if(arr[l-1-i]<arr[i]) {
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
			fgfgfd
			
		}
		
		System.out.println(arr[l-1-i]-arr[i]);
		if(arr[l-1-i]-arr[i]>0) {
			System.out.println(arr[l-1-i]-arr[i]);
		}
		}
		}

}
