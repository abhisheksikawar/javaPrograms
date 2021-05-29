import java.util.Arrays;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="asdfdsertgfcvbd";
		int arr[]=new int[26];
		int max=-1;
		int index=0;
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
			
		}
		for(int i=0;i<26;i++) {
			if(max<arr[i]) {
				max=arr[i];
				System.out.println(max);
				index=i;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(index);

	}

}
