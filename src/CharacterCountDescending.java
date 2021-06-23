import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class CharacterCountDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aabbbccdeeeeaasyasertyuiopl";
		int l=s.length();
		int []arr=new int[26];
		for(int i=0;i<l;i++) {
			arr[s.charAt(i)-'a']++;
		}
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<26;i++) {
			hm.put((char)(i+'a'),arr[i]);
		}
		System.out.println(hm);
		ArrayList al=new ArrayList(hm.entrySet());
		Collections.sort(al,(o1,o2)->{
			return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
		});
		//System.out.println(al);
		ListIterator it=al.listIterator();
		while(it.hasPrevious()) {
			Entry<Character,Integer>e=(Entry<Character, Integer>) it.previous();
			System.out.println(e);
			
		}
		System.out.println("dsf");
		Iterator it1=al.iterator();
		while(it1.hasNext()) {
			Map.Entry entry=(Map.Entry)it1.next();
			System.out.print(entry+" " );
			
			
		}
		
		
		
		
	}

}
