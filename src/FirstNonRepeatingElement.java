import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char arr[]=new char[] {'h','e','l','l','o'};
//		System.out.println(Arrays.toString(arr));
//		System.out.println(String.valueOf(arr));
		
		String s="ABCDAB";
		char []c=s.toCharArray();
		int l=c.length;
		int count=0;
		LinkedHashMap<Character, Integer> lhm=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<l;i++) {
			if(lhm.containsKey(c[i])) {
				count=lhm.get(c[i]);
				lhm.put(c[i],count+1 );
			}
			else {
				lhm.put(c[i],1);
			}
		}
		for(Entry<Character, Integer> e:lhm.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey());
				break;
			}
			
		}
		
		String s1="ABCDBC";
		
		char c1[]=s1.toCharArray();
		int len=c1.length;
		boolean flag=false;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(c1[i]==c1[j]) {
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println(c1[i]);
				break;
			}
			flag=false;
		}

	}

}
