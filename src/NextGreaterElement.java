import java.util.Arrays;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =new int[] {4, 5, 2, 25};
		int ans[]= new int[4];
		int k=0;
		int flag=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					ans[k++]=arr[j];
					flag=1;
					
				}
				if(flag==0) {
					ans[k++]=-1;
					
				}
			}
			
			
		}
		System.out.println(Arrays.toString(ans));

	}

}
