import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};
		int l=arr.length;
		System.out.println("enter the number to search");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int start=0;
		int last=l-1;
		int mid=(start+last)/2;
		while(start<=last) {
			if(arr[mid]<n) {
				start=mid;
				mid=(start+last)/2;
			}
			else if(arr[mid]>n) {
				last=mid;
				mid=(start+last)/2;
			}
			else if(arr[mid]==n) {
				System.out.println("elemet fount at location"+ mid);
				break;
			}
		}

	}

}
