import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortMapKeysAndValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> hm=new HashMap<String,String>();
		
		hm.put("5","abhi");
		hm.put("4","ram");
		hm.put("3","akassh");
		hm.put("2","bittu");
		
		TreeMap<String,String> tm=new TreeMap<>();
		for(Entry<String,String> entry: hm.entrySet()) {
			
			tm.put(entry.getKey(), entry.getValue());
			
		}
		System.out.println(tm);
		
		ArrayList al=new ArrayList(hm.entrySet());
		Collections.sort(al,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				//String s1=(String)o1;
				//String s2=(String)o2;
				
				return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
			
		
		});
		System.out.println(al);
		

		
		
	}

}
