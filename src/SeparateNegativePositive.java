import java.util.Arrays;

public class SeparateNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {-1,2,3,5,-1,0,-4,-5,24,-9};
		int length=arr.length;
		int s=0;
		int m=0;
		int case1=0;
		int temp=0;
		int l=length-1;
		while(m<=l) {
			if(arr[m]<0) {
				
				case1=-1;
				}
			else if(arr[m]>0) {
				case1=1;
			}
			else {
				case1=0;
			}
			switch(case1) {
			
			case -1 :
				temp=arr[s];
				arr[s]=arr[m];
				arr[m]=temp;
				s++;
				m++;
				break;
			
			case 1 :
				temp=arr[m];
				arr[m]=arr[l];
				arr[l]=temp;
				l--;
				break;
				
			case 0:
				m++;
				break;
			}
				
		
		}
		System.out.println(Arrays.toString(arr));
	}

}
