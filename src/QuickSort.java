import java.util.Arrays;

public class QuickSort {
	
	public void sort(int arr[],int low,int high){
	if(low<high) {
		int pi=partition(arr,low,high);
		System.out.println("running first sort");
		sort(arr,low,pi-1);
		System.out.println("running second sort");
		sort(arr,pi+1,high);
		
	}
	}



private static int partition(int[] arr, int low, int high) {
	// TODO Auto-generated method stub
	
	int pivot=arr[high];
	int i=low-1;
	for(int j=low;j<high;j++) {
		if(arr[j]<=pivot) {
			i++;
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		}
	int temp=arr[i+1];
	arr[i+1]=arr[high];
	arr[high]=temp;
	return i+1;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,66,55,44,31,8,6,91,7};
		int l=arr.length;
		int low=0;
		int high=l-1;
		
		QuickSort qs=new QuickSort();
		qs.sort(arr, low, high);
		
		System.out.println(Arrays.toString(arr));
		


}
	}

