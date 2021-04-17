import java.util.Arrays;

public class QuickSort02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {45,32,30,26,22,19,16,11,9,8,4};
		int l= arr.length;
		sort(arr,0,l-1);
		System.out.println(Arrays.toString(arr));

	}

	private static void sort(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		int partitionIndex;
		if(low<high) {
			partitionIndex=partition(arr,low,high);
			
			sort(arr,low,partitionIndex-1);
			sort(arr,partitionIndex+1,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		int pivot=arr[high];
		int i=low-1;
		//System.out.println(i);
		for(int j=low;j<high;j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				 arr[i]=arr[j];
				arr[j]=arr[i];
				
			}
		}
		
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		
		return i+1;
	}

}
