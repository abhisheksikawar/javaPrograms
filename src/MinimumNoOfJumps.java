
public class MinimumNoOfJumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1 ,4 ,5, 1, 2, 5, 1, 2, 3, 2, 3, 3, 2, 5, 0, 5, 3, 1, 3, 0};
		int l=arr.length;
		//System.out.println(l);
		int count=0;
		int n=0;
		while(n<l-1) {
			if(arr[n]<l-1) {
				n=n+arr[n];
				count +=1;
				//System.out.println(count+" "+n);
			}
			
		}
		//System.out.println(count+" "+n);
		

	}

}
