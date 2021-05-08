import java.util.Vector;

public class FirstNegativeElementOfWindowInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,-1,-3,2,5,-6,7,9,10,11,-2};
		int l=arr.length;
		int k=3;
		int i = 0,j=0;
		Vector<Integer> v=new Vector<>();
		//System.out.println(i);
		while(j<l) {
			if(arr[j]<0) {
				v.add(arr[j]);
			}
			//System.out.println(v);
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				int x=i;
				while(x<=j) {
					if(!(arr[x]>0)) {
						System.out.println(arr[x]);
						break;
					}
					x++;
				}
				
				j++;
				i++;
				//v.remove(i);
			}
			
			
		}

	}

}
