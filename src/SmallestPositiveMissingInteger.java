import java.util.Arrays;

public class SmallestPositiveMissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = { 4 };
		int l=A.length;
		int arr[]=new int[l+1];
		
		int result;
		int j=1;
		for(int i=0;i<l;i++) {
			if(A[i]>0&&A[i]<l) {
				arr[j++]=A[i];
				
			}
		}
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<=l;i++) {
			if(arr[i]!=i) {
				System.out.println(i);
				break;
			}
			
		}
		

	}

}
