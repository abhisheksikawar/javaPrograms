import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,-1,-3,5};
		int i=0,j=0;
		int l=arr.length;
		int k=3;
		ArrayList ans=new ArrayList();
		Deque<Integer> de=new LinkedList();
		while(j<l) {
			//System.out.println(j);
			if(!de.isEmpty()&&arr[j]>de.peekFirst
					()) {
				de.removeFirst();	
			}
			de.addLast(arr[j]);
			System.out.println(de);
			
			
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				ans.add(de.getLast());
				i++;
				j++;
			}
		}
		System.out.println(ans);

	}

}
