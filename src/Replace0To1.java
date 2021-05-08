import java.util.Arrays;

public class Replace0To1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i=1012301011;
		String string=Integer.toString(i);
		char []c=string.toCharArray();
		for(int j=0;j<c.length;j++) {
			if(c[j]=='0') {
				c[j]='1';
			}
			
		}
		System.out.print(Arrays.toString(c));
		System.out.println(String.valueOf(c));
		String s1=String.valueOf(c);
		Integer i1=Integer.parseInt(s1)+1;
		System.out.println(i1);
		
	}

}
