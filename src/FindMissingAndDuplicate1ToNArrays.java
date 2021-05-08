import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FindMissingAndDuplicate1ToNArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,4,3,4,5};
		int l=arr.length;
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i=0;i<l;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			}else {
				hm.put(arr[i],1);
			}
			
		}
		System.out.println(hm);
		for(int i=1;i<=l;i++) {
			if(!hm.containsKey(i)) {
				System.out.println("found missing element "+(i));
			}
		}
		for(Entry<Integer,Integer> e:hm.entrySet() ) {
			if(e.getValue()>1) {
				System.out.println("found duplicate element "+ e.getKey());
			}
		}
		

	}

}
