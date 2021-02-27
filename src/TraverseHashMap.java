import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TraverseHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> hm=new HashMap<String,String>();
		hm.put("1","abhi");
		hm.put("2","abhi");
		hm.put("3","abhi");
		hm.put("4","abhi");
		hm.put("1","abhis");
		
//		for(String s:hm.keySet()) {
//			System.out.println(s + hm.get(s));
//		}
		
//		for(Entry<String, String> s:hm.entrySet() ) {
//			System.out.println(s);
//		}
		
		Set<String> s=hm.keySet();
		Iterator i=s.iterator();
		while(i.hasNext()) {
			String temp=(String) i.next();
			System.out.println(temp+hm.get(temp));
		}

//		Iterator<String> it= hm.it
//		while(hm)

	}
	

}
