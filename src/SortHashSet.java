import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SortHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet hs=new HashSet();
		hs.add(1);
		hs.add(34);
		hs.add(45);
		hs.add(23);
		hs.add(4);
		hs.add(5);
		hs.add(2);
//		List l=new ArrayList();
//		l.addAll(hs);
//		Collections.sort(l);
//		System.out.println(l);
//		
		TreeSet ts=new TreeSet(hs);
		
		System.out.println(ts);

	}

}
