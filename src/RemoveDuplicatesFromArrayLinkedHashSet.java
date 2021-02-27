import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"Abc","abc","abc","bcv","bcd","bcs","bcd"};
		int l=arr.length;
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		for(int i=0;i<l;i++) {
			lhs.add(arr[i]);
		}
		arr=lhs.toArray(arr);
		System.out.println(lhs);
		System.out.println(Arrays.toString(arr));

	}

}
