import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithotRepeatingCharacter {
	
	public static int uniqueSubString(String s){
		int i=0,j=0,max=0;
		Map<Character,Integer> hm=new HashMap<>();
		int l=s.length();
		while(j<l) {
			if(hm.containsKey(s.charAt(j))) {
				hm.put(s.charAt(j), hm.get(s.charAt(j))+1);
			}else {
				hm.put(s.charAt(j),1);
			}
			System.out.println(hm);
			if(hm.size()==j-i+1) {
				if(j-i+1>max) {
					max=j-i+1;
				}
				j++;
			}
			else if(hm.size()<j-i+1) {
				while(hm.size()<j-i+1) {
					hm.put(s.charAt(i),hm.get(s.charAt(i))-1);
					if(hm.get(s.charAt(i))==0) {
						hm.remove(s.charAt(i));
					}
					i++;
				}
				j++;
				
			
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="pwwecrvw";
		System.out.println(uniqueSubString(s));
	}

}
