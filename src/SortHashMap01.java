import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class SortHashMap01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap<Integer,String> hm=new HashMap<>();
//		hm.put(23, "value1");
//		hm.put(13, "qw");
//		hm.put(25, "value2");
//		hm.put(3, "value3");
//		hm.put(2, "value4");
//		
//		
//		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
//		tm.putAll(hm);
//		for(Entry<Integer,String> entry: tm.entrySet()) {
//			System.out.println(entry);
//		}
		
		HashMap<String,String> hm=new HashMap<>();
		hm.put("23", "A");
		hm.put("2", "D");
		hm.put("25", "Y");
		hm.put("21", "T");
		hm.put("5", "E");
		
		ArrayList al=new ArrayList(hm.entrySet());
		Collections.sort(al, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
			      return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
				//return ((Comparable)((Map.Entry)(o1)).getValue()).compareTo(((Map.Entry)(o2)).getValue());
			}
			
		});
		
		HashMap lhm=new LinkedHashMap();
		Iterator it=al.iterator();
		while(it.hasNext()) {
			Map.Entry e= (Entry) it.next();
			lhm.put(e.getKey(), e.getValue());
		}
		System.out.println(lhm);
		
	}

}
