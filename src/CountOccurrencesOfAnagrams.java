import java.util.HashMap;

public class CountOccurrencesOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abaabcbbaaabab";
		String pattern="abaab";
		
		HashMap<Character,Integer> hm=new HashMap<>();
		int i=0,j=0;
		int l=s1.length();
		int k=pattern.length();
		int count=0;
		int ans=0;
		int x=0;
		//System.out.println(pattern.charAt(x));
		while(x<k) {
			if(hm.containsKey(pattern.charAt(x))) {
				//System.out.println(hm+" "+hm.get(x));
				hm.put(pattern.charAt(x), hm.get(pattern.charAt(x))+1);
			}else {
				//System.out.println("else");
				hm.put(pattern.charAt(x), 1);
			}
			x++;
		}
		count=hm.size();
		System.out.println(count);
		//System.out.println(hm);
		while(j<l) {
			
			if(hm.containsKey(s1.charAt(j))) {
				hm.put(s1.charAt(j), hm.get(s1.charAt(j))-1);
				if(hm.get(s1.charAt(j))==0){
					count=count-1;
					System.out.println(count+"count");
				}
			}
			System.out.println(hm);
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				//System.out.print(s1.charAt(j));
				System.out.println(s1.substring(i, j+1));
				
				if(count==0) {
					
					ans++;
				}
				//System.out.println(s1.charAt(i));
				if(hm.containsKey(s1.charAt(i))) {
				hm.put(s1.charAt(i), hm.get(s1.charAt(i))+1);
				System.out.println("in window"+hm);
				if(hm.get(s1.charAt(i))==1) {
					count++;
					System.out.println(count+" "+hm.size());
				}
				}
				
				
				
				i++;
				j++;
				
			}
		}
		System.out.println("ans"+ans);

	}

}
//abbaa
//acbbaaba