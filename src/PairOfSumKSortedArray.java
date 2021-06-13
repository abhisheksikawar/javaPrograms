
public class PairOfSumKSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {2,3,6,9,11,33,45};
		int sum=21;
		int x=0;
		int y=arr.length-1;
		while(x<y) {
			if(arr[x]+arr[y]==sum) {
				System.out.println("got it");
				break;
			}else if(arr[x]+arr[y]>sum) {
				y--;
			}
			else if(arr[x]+arr[y]<sum) {
				x++;
			}
		}

	}

}
