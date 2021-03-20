import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is actual bubble sort
		int arr[]= {1,33,23,67,66,7,8,2,5,3,9};
		int l=arr.length;
		int temp;
//		for(int i=0;i<l;i++) {
//			for(int j=0;j<l-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//					
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<l;i++) {
			for(int j=i;j<l;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		


	}

}
