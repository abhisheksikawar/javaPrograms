import java.util.Arrays;

public class ShiftArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,3,4,5};
		int l=arr.length;
//		int temp=arr[l-1];
//		for(int i=l-1;i>0;i--) {
//			arr[i]=arr[i-1];
//		}
//		arr[0]=temp;
//		
//		System.out.println(Arrays.toString(arr));

		int temparr[]=new int[2];
		for(int i=0;i<l-2;i++) {
			if(i<2) {
				temparr[i]=arr[i];
			}
			arr[i]=arr[i+2];
		}
		int x=0;
		for(int i=l-2;i<l;i++) {
			arr[i]=temparr[x++];
		}
		System.out.println(Arrays.toString(arr));
	}

}
