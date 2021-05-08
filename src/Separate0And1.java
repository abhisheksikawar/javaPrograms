import java.util.Arrays;

public class Separate0And1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,1,0,1,0,0,0,1,1,0};
		int l=arr.length;
		int i=0;
		int temp=0;
		while(i<=l-1) {
			if(arr[i]==0) {
				i++;
			}else if(arr[i]==1) {
				temp=arr[i];
				arr[i]=arr[l-1];
				arr[l]=temp;
				l--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
