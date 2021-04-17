import java.io.*;
import java.util.*;
 
 
public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = sc.nextInt();
         int X = sc.nextInt();
         long K = sc.nextLong();
         String S = sc.next();
         String out_ = Find_It(X, K, S, N);
         System.out.println(out_);
 
         wr.close();
         br.close();
    }
    static String Find_It(int X, long K, String S, int N){
    
    List<List<Integer>> res = new ArrayList<List<Integer>>();
		int i=0;
		while(i<S.length())
		{
			List<Integer> arr = new ArrayList<Integer>();
			int l = i;
			System.out.println("min length= "+Math.min(S.length(), l+X));
			for(int j=i;j<Math.min(S.length(), l+X); j++,i++)
			{
				int val = S.charAt(i) - '0';
				if(!arr.contains(val))
					arr.add(val);
			}
			System.out.println((arr));
			Collections.sort(arr);
			res.add(arr);
		}
		K--;
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int j = res.size()-1;j>=0;j--)
		{
			int index = res.get(j).size();
			int ele = res.get(j).get((int)(K%index));
			result.add(ele);
			K = K/index;
		}
		Collections.reverse(result);
		StringBuilder str = new StringBuilder();
		for(int num: result) 
		{
			str.append(num);
		}
		return str.toString();
 
    
    }
}