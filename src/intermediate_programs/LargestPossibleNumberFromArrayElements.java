package intermediate_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestPossibleNumberFromArrayElements {
	
	public static void main(String args[]) {
	String arr[]=new String[] {"12","92","29","19","91","11","05"};
	int l=arr.length;
	for(int i=0;i<l;i++) {
		char[] c=arr[i].toCharArray();
		Arrays.sort(c);
		System.out.println(c);
		String s=Arrays.toString(c);
		arr[i]=s;
		
		
	}
	System.out.println(Arrays.toString(arr));
	}

}

