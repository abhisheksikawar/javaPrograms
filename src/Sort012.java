import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,2,0,0,1,2,2,2,0,1};
		int l=arr.length;
		int s=0;
		int m=0;
		int e=l-1;
		int temp=0;
		while(m<=e) {
			switch(arr[m]) {
			case 0:
				temp=arr[s];
				arr[s]=arr[m];
				arr[m]=temp;
				s++;
				m++;
				break;
			case 1:
				m++;
				break;
			case 2:
				temp=arr[m];
				arr[m]=arr[e];
				arr[e]=temp;
				e--;
				break;
			}
			System.out.println(Arrays.toString(arr));
			}
		//System.out.println(Arrays.toString(arr));
		}
		
	}

