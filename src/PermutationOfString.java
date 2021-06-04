
public class PermutationOfString {
	
	public static String swap(String str,int b,int l) {
		char temp;
		char [] arr=str.toCharArray();
		temp=arr[b];
		arr[b]=arr[l];
		arr[l]=temp;
		return String.valueOf(arr);
		
	}
	public static void permute(String str,int b,int l) {
		if(l==b) {
			System.out.println("ans="+str);
		}else {
			for(int i=b;i<=l;i++) {
				str=swap(str,b,i);
				System.out.println(str+" "+b+" "+i);
				permute(str,b+1,l);
				str=swap(str,b,i);
				System.out.println(str+" "+b+" "+i);
			}
			
		}
				
				
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ABC";
		int l=s.length();
		permute(s,0,l-1);
	}

}
