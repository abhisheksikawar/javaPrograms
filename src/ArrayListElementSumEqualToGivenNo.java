import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListElementSumEqualToGivenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		int n=5;
//		HashMap<Integer,Integer> hm=new HashMap<>();
//		for(int i=0;i<al.size();i++) {
//			if(hm.containsKey(n-al.get(i))) {
//				System.out.println("got it");
//			}
//			else {
//				hm.put(al.get(i),0 );
//			}
//		}
		for(int i=0;i<al.size();i++) {
			for(int j=i;j<al.size();j++) {
				if(al.get(i)+al.get(j)==n) {
					System.out.println(al.get(i)+al.get(j));
				}
			}
		}

	}

}
