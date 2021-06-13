import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,5,6,7,8};
		findGreater(arr);

	}

	private static void findGreater(int[] arr) {
		// TODO Auto-generated method stub
		Stack<Integer> stack=new Stack();
		int ans[]=new int[arr.length];
		int l=arr.length;
		for(int i=l-1;i>=0;i--) {
			
			if(!stack.empty()) {
				while(!stack.empty()&&stack.peek()<=arr[i]) {
					stack.pop();
				
				}
			}
			if(stack.empty()) {
				ans[i]=-1;
			}else {
				ans[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		System.out.println(Arrays.toString(ans));
	}

}
