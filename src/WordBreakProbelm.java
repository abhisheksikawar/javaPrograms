import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WordBreakProbelm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> dict=new HashSet<>();
		dict.add("cats");
		dict.add("cat");
		dict.add("sand");
		dict.add("and");
		dict.add("dog");
		
		String s="catsanddog";
		System.out.println(wordBreak(s,dict));
	}

	private static List wordBreak(String s, Set<String> dict) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		formWord("",0,s,list,dict);
		
		return list;
	}

	private static void formWord(String str, int pos, String s, List<String> list, Set<String> dict) {
		// TODO Auto-generated method stub
		if(pos==s.length()) {
			System.out.println((str));
			list.add(str.trim());
			return ;
		}
		for(int i=pos;i<s.length();i++) {
			String w=s.substring(pos,i+1);
			System.out.println(w);
			if(dict.contains(w)) {
				System.out.println(str+" "+w+"$$ "+(i+1)+"$$ "+s);
				formWord(str+" "+w,i+1,s,list,dict);
			}
		}
		
		
	}

}
