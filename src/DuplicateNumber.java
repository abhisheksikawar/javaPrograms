import java.util.HashMap;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,2,5,6,2};
		int l=arr.length;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<l;i++) {
			if(hm.containsKey(arr[i])) {
				System.out.println(arr[i]);
				break;
			}
			else {
				hm.put(arr[i], 1);
			}
			
		}

	}

}
