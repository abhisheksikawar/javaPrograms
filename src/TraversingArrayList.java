import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TraversingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>(Arrays.asList("abhishek","abhi","sikarwar","sik","sikAbhi"));
		al.add("abhishekSikarwar");
		
//		if(al.contains("abhishek")){
//			System.out.println("got it");
//		}
//		for(String s:al) {
//		//	System.out.println(s);
//		}
		int l= al.size();
		for(int i=0;i<l/2;i++) {
		String temp=al.get(i);
		al.set(i, al.get(l-1-i));
		al.set(l-1-i, temp);
		
		}
		System.out.println(al);
//		for(int i=l-1;i>=0;i--) {
//			System.out.println(al.get(i));
//		}
//		
		

	}

}
