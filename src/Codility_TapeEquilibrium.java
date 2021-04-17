
public class Codility_TapeEquilibrium {
	
	public static void main(String args[]) {
		int arr[]=new int[] {3,1,2,4,3};
		System.out.println(solution(arr));
	}
	
	 public static int solution(int[] A) {
	        // write your code in Java SE 8

	        int l=A.length;
	        int part1=0;
	        int part2=0;
	        int result=Integer.MAX_VALUE;
	        int runningResult=0;
	        int sum=0;
	        for(int i=0;i<l;i++) {
	        	sum+=A[i];
	        }
	        
	        for(int i=0;i<l-1;i++) {
	        	part1+=A[i];
	        	part2=sum-part1;
	        	
	        	runningResult=Math.abs(part1-part2);
	        	//System.out.println(runningResult);
	        	if(runningResult<result) {
	        		result=runningResult;
	        	}
	        }


	        return result;
	    }

}
