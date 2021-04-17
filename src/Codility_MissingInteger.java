import java.util.Arrays;

public class Codility_MissingInteger {
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 
	        int l=A.length;
	        boolean arr[]=new boolean[l+1];
	        for(int i=0;i<l;i++){
	            if(A[i]<=l&&A[i]>0){
	                arr[A[i]]=true;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	        for(int i=1;i<l+1;i++){
	            if(arr[i]!=true){
	            	System.out.println(i);
	                return i; 
	            }
	        }
	        return l+1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]=new int[] {0};
		System.out.println(solution(arr1));

	}

}
