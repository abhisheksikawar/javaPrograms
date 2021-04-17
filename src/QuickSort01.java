import java.util.Arrays;

public class QuickSort01 {
	
	public static int partition(int arr[],int low, int high) {
		int pivot=arr[low];
		int i=low+1;
		int j=high;
		do {
		while(arr[i]<=pivot) {
			i++;
		}
		while(arr[j]>pivot) {
			j--;
		}
		if(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
		}while(i<j);
		int temp=arr[low];
		arr[low]=arr[j];
		arr[j]=temp;
		return j;
	}
	
	public static void sort(int arr[],int low,int high){
		
		if(low<high) {
			int partitionIndex=partition(arr,low,high);
			sort(arr,low,partitionIndex-1);
			sort(arr,partitionIndex+1,high);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//divide and conquer
		//we nneed to create partitions
		int arr[]= new int[] {10,15,1,2,9,16};
		
		sort(arr,0,4);
		System.out.println(Arrays.toString(arr));
		
		
	}

}
