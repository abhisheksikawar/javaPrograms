import java.util.Vector;
//first negative element in window
//brute force mein sum of window wala concept lagega
public class FirstNegativeElementOfWindowInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,-1,-3,2,5,-6,7,9,10,11,-2};
		int l=arr.length;
		int k=3;
		int i = 0,j=0;
		int flag=0;
		Vector<Integer> v=new Vector<>();
		//System.out.println(i);
		while(j<l) {
			//System.out.println(v);
			if(arr[j]<0) {
				v.add(arr[j]);
			}
			//System.out.println(v);
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
//				int x=i;
//				while(x<=j) {
//					if((arr[x]<0)) {
//						System.out.println(arr[x]);
//						break;
//					}
//					if(x==j) {
//						System.out.println("0");
//					}
//					x++;
				
				
				if(v!=null&&v.size()>0&&flag<v.size()) {
					System.out.println(v.get(flag));
					
					
				}
				else {
					System.out.println("0");
				}
				if(arr[i]<0) {
					//v.remove(flag);
					flag++;
				}
				
				j++;
				i++;
					
				
				
				
				//v.remove(i);
			}
			
			
		}

	}

}
