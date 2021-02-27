import java.util.HashMap;
import java.util.Scanner;

public class FindDuplicates {

	public static void main(String args []) {
		System.out.println("Enter no. of elements");
		Scanner sc=new Scanner(System.in);
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("enter array having duplictes");
		for (int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for (int i=0;i<length;i++) {
			if(hm.containsKey(arr[i])) {
				System.out.println(arr[i]+ "repeated element");
			}
			else {
				hm.put(arr[i],i);
			}
			
		}
		if(hm.size()==length) {
			System.out.println("not repeating");
		}
	}
}
