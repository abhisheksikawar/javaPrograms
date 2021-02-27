import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//****************using second array*********************
		
//		int arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};
//		int l=arr.length;
//		int arr2[]= new int[l];
//		int j=l-1;
//		for(int i=0;i<l;i++) {
//			arr2[j--]=arr[i];
//			
//		}
//		System.out.println(Arrays.toString(arr2));
		
		//**************using temp variable **************
		
		
//		int arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};
//		int l=arr.length;
//		int temp=0;
//		for(int i=0;i<l/2;i++) {
//			temp=arr[i];
//			arr[i]=arr[l-1-i];
//			arr[l-1-i]=temp;
//		}
//		System.out.println(Arrays.toString(arr));
//		
		//************* using list ***********************
		
		Integer arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};
		int l=arr.length;
		List<Integer> al=Arrays.asList(arr);
		Collections.reverse(al);
		System.out.println(Arrays.toString(al.toArray()));
		
		
		
		
		
		

	}

}
