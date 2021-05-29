import java.util.Arrays;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="My name is abhishek";
		String s1[]=s.split(" ");
		int i=0;
		int j=s1.length-1;
		String temp=null;
		while(i<j) {
			temp=s1[i].trim();
			s1[i]=s1[j].trim();
			s1[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(s1));
		
		for(int x=0;x<s1.length;x++) {
			i=0;
			j=s1[x].length()-1;
			char temp2;
			char s2[]=s1[x].toCharArray();
			while(i<j) {
				temp2=s2[i];
				s2[i]=s2[j];
				s2[j]=temp2;
				i++;
				j--;
			}
			System.out.println(Arrays.toString(s2));
		}
		

	}

}
