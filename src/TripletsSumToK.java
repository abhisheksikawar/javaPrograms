import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class TripletsSumToK {
	
	static List<List<Integer>> al=new ArrayList<List<Integer>>();
	List<Integer> addpair=new ArrayList<>();
	public List<List<Integer>>findSum(int arr[],int l,int sum){
		for(int i=0;i<l-1;i++){
		Map<Integer,Integer> hs=new HashMap<>();
		for(int j=i+1;j<l;j++) {
			int currSum=sum-arr[i];
			if(hs.containsKey(currSum-arr[j])) {
				addpair.add(i);
				addpair.add(j);
				addpair.add(hs.get(currSum-arr[j]));
				al.add(addpair);
				break;
				//System.out.println("sum");
			}else {
				hs.put(arr[j], j);
			}
			
			
		}
		}
		return al;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletsSumToK tripletsSumToK=new TripletsSumToK();
		int arr[]=new int[] { 1,5,8,10,12,6,4,2};
		int sum=14;
		int l=arr.length;
		
		tripletsSumToK.findSum(arr,l,sum);
		System.out.println(al);
		
		
		

	}

}
