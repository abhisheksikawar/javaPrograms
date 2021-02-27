import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Abc","abc","abc","bcv","bcd","bcs","bcd"};
		int l=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
		int j=0;
		for(int i=0;i<l-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i];
			}
		}
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}

	}

}
