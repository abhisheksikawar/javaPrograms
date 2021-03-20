import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7};
		int l=arr.length;
		int last=arr[l-1];
		int temp=0;
		for(int i=l-2;i>=0;i--) {
			temp=arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
