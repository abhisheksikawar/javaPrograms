import java.util.Arrays;

public class SortStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"abc","Abc","ABC","bcd","Bcd","Hi","Hello"};
		int l=arr.length;
		for(int i=0;i<l;i++) {
			for(int j=0;j<l;j++) {
				if(arr[i].compareTo(arr[j])<0) {
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
