import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};
		int l=arr.length;
		int arr2[]=new int[l-1];
		System.out.println("enter the number to search");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int j=0;
		for(int i=0;i<l;i++) {
			if(arr[i]!=n) {
				arr2[j++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
