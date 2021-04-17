
public class EquilateralTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  *
//		 * *
//		* * * 
		int n=6;
		createTriangle(n);
		

	}

	private static void createTriangle(int n) {
		// TODO Auto-generated method stub
		int l=6;
		if(n==0) {
			return;
		}else {
			int k=0;
			
			createTriangle(n-1);
			for(int j=0;j<l-n;j++) {
				System.out.print(" ");
			}
			
			while(k<n) {
				
				System.out.print("* ");
				k++;
			}
			System.out.println("");
		}
		
	}

	private static void createSpace(int i) {
		// TODO Auto-generated method stub
		
		
	}


}
