import java.util.HashMap;
import java.util.Map;

public class LargestSubArrayOfSumK_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[]=new int[] {3,2,4,-1,2,4,-3,7,4,-2};
		int arr[]=new int[]{-5, 8, -14, 2, 4,-3,-2};
		int k=-5;
//		int sum=0;
//		int templength=0;
//		int length=0;
//		int flag=0;
//		for(int j=0;j<arr.length;j++) {
//			sum=0;
//			flag=0;
//		for(int i=j;i<arr.length;i++) {
//			sum=sum+arr[i];
//			System.out.println("sum "+sum);
//			flag++;
//			if(sum==k) {
//				templength=flag;
//			}
//			if(templength>length) {
//				length=templength;
//			}
//			
//		}
//		System.out.println(length);
//		}
		Map<Integer,Integer> hm=new HashMap<>();
		int sum=0;
		int maxLen=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(sum==k) {
				maxLen=i+1;
			}
			if(!hm.containsKey(sum)) {
				hm.put(sum, i);
			}
			//System.out.println(hm);
			if(hm.containsKey(sum-k)) {
				System.out.println("hm.get(sum-k) "+hm.get(sum-k));
				if(maxLen<(i-hm.get(sum-k))) {
					maxLen=i-hm.get(sum-k);
				}
			}
			System.out.println(maxLen);
		}
		System.out.println("ans "+maxLen);

	}

}
