import java.util.Arrays;

public class SwapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,3,3,3,3};
		int i=0;
		int temp=0;
		while(i<arr.length) {
			if(arr[i]!=arr[arr[i]-1]) {  //3 != 5 
				temp=arr[i];			// 3
				arr[i]=arr[arr[i]-1];
				arr[temp-1]=temp;
			}
			else {
				i++;
			}
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(Arrays.toString(arr));
		}
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=j+1) {
				System.out.println("missing elemenrt "+(j+1)+"droplicate element "+arr[j]);
			}
			
		}
		

	}

}
