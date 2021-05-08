import java.util.Arrays;

public class RemoveDuplicatesWithoutLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,2,4,5,6,6,9,20,11,13,13};
		int l=arr.length;
		System.out.println(l);
		int lenDec=1;
		Arrays.sort(arr);
		for(int i=0;i<l-1;i++) {
			if(arr[i]==arr[i+1]) {
				for(int j=i+1;j<l-1;j++) {
					arr[j]=arr[j+1];
				}
				l=l-1;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(l);
		

	}

}
