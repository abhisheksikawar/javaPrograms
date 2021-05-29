
public class GreatestCommonDivisorRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20;
		int y=30;
		
		int ans=getGCD(100,49,49/2);
		System.out.println(ans);

	}

	private static int getGCD(int i, int j,int k) {
		// TODO Auto-generated method stub
		if(k>0) {
			//System.out.println(i+" "+j+" "+k);
		if(i%k==0&&j%k==0) {
			System.out.println(i+" "+j+" "+k);
			return k;
		}
		else {
			System.out.println(i+" "+j+" "+k);
			return getGCD(i, j, k=k-1);
			
		}
		}
		return 0;
		
	}

}
