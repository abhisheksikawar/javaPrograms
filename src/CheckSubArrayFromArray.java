import java.util.Arrays;

public class CheckSubArrayFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9,13};
		int arr2[]=new int[] {2,6,11,4,8};
		int l1=arr.length;
		int l2=arr2.length;
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int i=0;
		int j=0;
		while(i<l1&&j<l2) {
			if(arr[i]<arr2[j]) {
				i++;
			}
			else if(arr[i]==arr2[j]) {
				i++;
				j++;
				//System.out.println("found match");
			}
			else if(arr[i]>arr2[j]) {
				System.out.println("Not aaa sub array");
				break;
			}
		}
		if(l2==j) {
			System.out.println("Sub array");
		}
		else{
			System.out.println("Not a sub array");
			}
		

	}

}
