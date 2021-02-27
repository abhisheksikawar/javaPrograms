import java.util.HashMap;
import java.util.Map;

public class RequiredSumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {0,1,2,3,4,5,6,7,8,9,10};
		int sum=10;
		Map<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(sum-arr[i])) {
				System.out.println("got the sum at index"+(i)+hm.get(sum-arr[i]));
				
			}
			else {
			hm.put(arr[i],i);
			}
		}
		System.out.println(hm);

	}

}
