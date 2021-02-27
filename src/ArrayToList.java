import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String [] args) {
		//ways of initialising array
		String a[]=new String[] {"abbhishek","abhi","sik","sikarwar"};
		String a1[]= {"abhishek","abhi"};
		String a2[]=new String[10];
		
		List<String> al=new ArrayList<>();
		al=Arrays.asList(a);
		System.out.println(al);
//		for (int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
//		
	}

}
