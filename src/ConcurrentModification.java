import java.util.ArrayList;

public class ConcurrentModification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al=new ArrayList<>();
		al.add("abhi");
		al.add("abhis");
		al.add("abhish");
		al.add("abhishe");
		al.add("abhishek");
		
		for(String s:al) {
			
			System.out.println(s);
			if(s.equals("abhis")) {
				al.remove(3);
			}
			
			
			
		}

	}

}
