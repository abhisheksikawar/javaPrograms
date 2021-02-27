import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm =new HashMap<String,String>();
		hm.put("33", "A");
		hm.put("23", "D");
		hm.put("99", "X");
		hm.put("1", "B");
		hm.put("12", "I");
		
		for(Entry<String, String> e:hm.entrySet()) {
			System.out.println(e);
		}
		
		TreeMap<String,String> tm=new TreeMap<String,String>();
		tm.putAll(hm);
		System.out.println("after sorting");
		for(Entry<String, String> e:tm.entrySet()) {
			System.out.println(e);
		}
		
		//sorting hashmap onthe basis of values
		
		List ll=new LinkedList(hm.entrySet());
		//custom comparator
		Collections.sort(ll,new Comparator() {
			public int compare(Object o1,Object o2) {
				return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
				 
			}
		});
		
		HashMap hmap=new LinkedHashMap();
		Iterator it=ll.iterator();
		while(it.hasNext()) {
			Map.Entry entry=(Map.Entry)it.next();
			hmap.put(entry.getKey(), entry.getValue());
		}
		System.out.println(hmap);
		
	}

}
