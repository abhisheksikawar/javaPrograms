import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithKUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabacbe";
		int k=3;
		int ans=findSubString(s,k);
		System.out.println(ans);
	}

	private static int findSubString(String s, int k) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		int l=s.length();
		int max=0;
		Map<Character,Integer> hm=new HashMap<>();
		while(j<l) {
			if(hm.containsKey(s.charAt(j))) {
				hm.put(s.charAt(j), hm.get(s.charAt(j))+1);
			}
			else {
				hm.put(s.charAt(j), 1);
			}
			if(hm.size()<k) {
				j++;
			}
			else if(hm.size()==k) {
				if(max<j-i+1) {
					max=j-i+1;
				}
				j++;
			}
			else if(hm.size()>k) {
				while(hm.size()>k) {
					hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
					
					if(hm.get(s.charAt(i))==0) {
						hm.remove(s.charAt(i));
					}
					i++;
				}
				j++;
			}
			
			
			
			//System.out.println(hm);
			
		}
		return max;
	}

}
