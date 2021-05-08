import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class LargestNumberFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestNumberFromArray lmfa=new LargestNumberFromArray();
		int arr[]=new int[] {1,2,45,98,9,73};
		lmfa.findLargest(arr);

	}

	private void findLargest(int[] arr) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<>();
		
		for(int i=0;i<arr.length;i++) {
			v.add(Integer.toString(arr[i]));
		}
		
		Collections.sort(v,new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				String s1=(String )o1;
				String s2=(String )o2;
				String XY=s1+s2;
				System.out.println("XY= "+XY);
				String YX=s2+s1;
				System.out.println("YX "+YX);
				if(XY.compareTo(YX)>0) {
					//System.out.println("if "+v);
					return -1;
				}
				//System.out.println("else "+v);
				return 1;
				
			}
			
		});
		
		System.out.println(v);
		
	}

}
