
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abtytba";
//		char a[]=s.toCharArray();
//		int l=a.length;
//		int j=l-1;
//		int i=0;
//		int t=0;
//		while(i<j) {
//			if(a[i]!=a[j]) {
//				System.out.println("Not a pallindrome");
//				t=1;
//				break;
//			}
//			i++;
//			j--;
//		}
//		if(t==0) {
//			System.out.println("Palindrome");
//		}
//		
		
		StringBuilder sb=new StringBuilder(s);
		StringBuilder rev=sb.reverse();
		String revString=rev.toString();
		System.out.println(revString+" "+s);
		if(revString.equals(s)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not");
		}

	}

}
