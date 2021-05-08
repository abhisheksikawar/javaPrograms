import java.util.Arrays;

public class SeparateMinus101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {0,1,-1,0,0,1,1,-1,0,-1};
		int l=arr.length;
		int e=l-1;
		int s=0;
		int m=0;
		int temp=0;
		while(m<=e) {
			if(arr[m]<0) {
				temp=arr[m];
				arr[m]=arr[s];
				arr[s]=temp;
				
				s++;
				m++;
				
				
			}
			else if(arr[m]==0) {
				m++;
			}
			else if(arr[m]>0) {
				temp=arr[m];
				arr[m]=arr[e];
				arr[e]=temp;
				
				e--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
