
public class Codility_Tricoloring {
	
	static int reqsum=0;
	static int count=0;
	static int n=5;
	 static void f(int[] pat, int i, int currSum) {
	        if (currSum == reqsum) {
	            count++;
	            return;
	        }
	        if (currSum < reqsum && i < n) {
	            f(pat, i+1, currSum + pat[i]);
	            f(pat, i+1, currSum);
	        }
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {3,7,2,5,4};
		int sum=0;
		int k=3;
		int l=arr.length;
		for(int i=0;i<l;i++) {
			sum=sum+arr[i];
		}
		//int reqSum=0;
		if(sum%k==0&&k<=l) {
			reqsum=sum/k;
			f(arr, 0, 0);
			System.out.println(count++);
		}else {
			System.out.println("impossible");
		}

	}

}
