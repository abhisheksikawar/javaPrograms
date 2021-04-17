import java.util.Arrays;

public class RotateArrayII {
	
    public static int[] solution(int[] A, int K) {
        // write your code in Java SE 8
 
        int l=A.length;
        if(l>0&&K>0) {
        for(int i=0;i<K;i++) {
        	int last=A[l-1];
        	for(int j=l-1;j>0;j--) {
        		A[j]=A[j-1];
        	}
        	A[0]=last;
        }
        return A;
        }
        return A;
            } 

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int arr[]=new int [] {};
		int k=7;
		int result[]=solution(arr,k);
		System.out.println(Arrays.toString(result));
		

	}

}
