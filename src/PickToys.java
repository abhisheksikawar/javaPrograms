import java.util.HashMap;
import java.util.Map;

public class PickToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,1,1,2,3,2,2,3,3,4,3,4,3,4,3,4,1,2};
		int l=arr.length;
		int i=0,j=0;
		int k=2;
		int count=0;
		int ans=0;
		Map<Integer,Integer> hm=new HashMap<>();
		while(j<l) {
			if(hm.containsKey(arr[j])) {
				hm.put(arr[j],hm.get(arr[j])+1);
			}else {
				hm.put(arr[j], 1);
			}
			if(hm.size()<k) {
				j++;
			}
			else if(hm.size()==k) {
				count=0;
				for(Map.Entry<Integer, Integer> e:hm.entrySet()) {
					count=count+e.getValue();
				}
				if(count>ans) {
					ans=count;
					System.out.println(ans+" "+hm+" "+j);
				}
				j++;
			}
			else {
				while(hm.size()>k) {
					hm.put(arr[i],hm.get(arr[i])-1);
					if(hm.get(arr[i])==0) {
						hm.remove(arr[i]);
					}
					i++;
					System.out.println(hm);
				}
				j++;
			}
			
		}
		System.out.println(ans);
	}

}
