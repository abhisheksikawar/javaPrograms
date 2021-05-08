import java.util.Arrays;

public class LargestNumberArrayWithoutComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[3,30,23,9]
		//[9,30,23,3]
		//[9,3,23,30]
		//[9,3,30,23]
		String arr[]=new String[] {"54", "546", "548", "60"};
		int l=arr.length;
		String temp=null;
		for(int i=0;i<l;i++) {
			for(int j=i+1;j<l;j++) {
				System.out.println(arr[i]+arr[j]);
				String XY=arr[i]+arr[j];
				String YX=arr[j]+arr[i];
				if(YX.compareTo(XY)>0) {
					System.out.println("YX="+YX+" XY="+XY);
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));

	}

}
