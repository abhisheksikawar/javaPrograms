import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TraversingHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hs=new HashSet<>();
		hs.add("abhishek");
		hs.add("abhi");
		hs.add("sik");
		hs.add("sikarwar");
		hs.add("abhisik");
		hs.add("abhisheksikarwar");
		
		if(hs.contains("sik")) {
			System.out.println("present");
		}
//		System.out.println(hs);
//		Iterator it=hs.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

	}

}
