import java.util.HashMap;
import java.util.Map;

public class CountDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]=new String [] {"Abhi","abhi","Sik","Sik","sik","Abhishek"};
		Map<String,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String s=arr[i].toLowerCase();//this line is reuired if u are conidering Abhi and abhi same
			if(hm.containsKey(s)) {
				int count=hm.get(s);
				hm.put(s,count+1 );
			}
			else {
				hm.put(s, 1);
			}
		}
		System.out.println(hm);

	}

}
