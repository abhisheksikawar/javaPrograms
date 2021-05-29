
public class ReverseStringRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abhishek";
		reverse(str);

	}
	public static void reverse(String s) {
		if(s.length()<=1) {
			System.out.print(s.charAt(0));
			return ;
		}else {
			System.out.print(s.charAt(s.length()-1));
			reverse(s.substring(0, s.length()-1));
			
		}
		
	}

}
