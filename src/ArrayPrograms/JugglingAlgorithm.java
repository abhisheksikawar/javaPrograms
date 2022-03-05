package ArrayPrograms;

import java.util.Arrays;

public class JugglingAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,3,4,5,6,7,8,9};
		int d=4;
		int i,j,m;
		int temp=0;
		int l=arr.length;
		int gcd=HCF(d,l);
		System.out.println(gcd);
		for(i=0;i<gcd;i++) {
			temp=arr[i];
			j=i;
			
			while(true) {
			m=j+d;
			if(m>=l) {
				m=m-l;
				
			}
			if(m==i) {
				break;
			}
			arr[j]=arr[m];
			j=m;
			
		}
			arr[j]=temp;
		}
		
		System.out.println(Arrays.toString(arr));
		

	}
							
	private static int HCF(int d, int l) {
		// TODO Auto-generated method stub   2,6   
		if(l==0) {
			return d;
		}
		
		return HCF(l,d%l);
	}

}
