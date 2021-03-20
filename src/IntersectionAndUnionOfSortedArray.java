import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionAndUnionOfSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//intersection of 2 arrays
		
//		int arr1[]= {1,2,3,4,5,6};
//		int arr2[]= {1,2,3,7,8,9,10,11,4,12};
//		for(int i=0;i<arr1.length;i++) {
//			for(int j=0;j<arr2.length;j++) {
//				if(arr1[i]==arr2[j]) {
//					System.out.println(arr1[i]);
//				}
//			}
//		}
//		
		
		// union of two arrays
		
//		int arr1[]= {1,2,3,4,5,6};
//		int arr2[]= {1,2,3,7,8,9,10,11,4,12};
//		HashSet<Integer> hs=new HashSet<>();
//		for(int i=0;i<arr1.length;i++) {
//			hs.add(arr1[i]);
//			
//		}
//		for(int i=0;i<arr2.length;i++) {
//			hs.add(arr2[i]);
//		}
//		System.out.println(hs);
//		
		//intersecion better way
		
		Integer arr1[]= {1,2,3,4,5,6};
		Integer arr2[]= {1,2,3,7,8,9,10,11,4,12};
		
		
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(arr1));
		Set<Integer> s2 = new HashSet<Integer>(Arrays.asList(arr2));
		s1.retainAll(s2);

		Integer[] result = s1.toArray(new Integer[s1.size()]);
		System.out.println(Arrays.toString(result));
		System.out.println(s1);
		
		
	}

}
