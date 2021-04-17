import java.util.ArrayList;
import java.util.List;

public class Codility_FrogRiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,3,1,4,2,3,5,4};
		System.out.println(solution(5,arr));
	}
	public static int solution(int X, int[] A) {
        // write your code in Java SE 8
                int l=A.length;
                int temp=X;
                List<Integer> al=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(!al.contains(A[i])&&A[i]<=X){
                al.add(A[i]);
                temp--;
            }
           // System.out.println(al);
            if(temp==0) {
            	return i;
            }
        }
        return -1;
    }

}
