import java.util.Arrays;

public class Codility_MaxCounters {
	
	public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int arr[]=new int[N];
        int l=A.length;
        int max=0;
        for(int i=0;i<l;i++){
            if(A[i]<=N&&A[i]>=1){
                arr[A[i]-1]=arr[A[i]-1]+1;
               // System.out.println(Arrays.toString(arr));
                if(arr[A[i]-1]>max){
                max=arr[A[i]-1];
               // System.out.println(max);
            }
            }
            
            if(A[i]>N&&max!=0){
                Arrays.fill(arr, max);
                //System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]=new int[] {6,6,6,6,6,6,6};
		
		System.out.println(Arrays.toString(solution(5,A)));

	}

}
