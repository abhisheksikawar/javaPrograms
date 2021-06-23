
public class MinimumStepsToReachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,4,3,5,6,3,1,4,5,3,1,2,1};
		int pointer=9;// it will start from 0
		int value=4; // value or element u r looking for
		int x=pointer;
		int y=pointer;
		int count=0;
		while(x>=0&&y<arr.length) {
			if(arr[x]==value) {
				System.out.println(count );
				return ;
			}else if(arr[y]==value) {
				System.out.println(count);
				return ;
			}
			x--;
			y++;
			count++;
			if(x==-1){
				x=arr.length-1;
			}
			if(y==arr.length) {
				y=0;
			}
		}
		
	}

}
