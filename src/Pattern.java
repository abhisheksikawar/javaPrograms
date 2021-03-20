
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		00000**00000
//		0000*00*0000
//		000*0000*000
//		00*000000*00
//		0*00000000*0
//		*0000000000*
		
		int l=12;
		int j=l/2;
		int k=(l/2)-1;
		int a=l-2/2;
		for(int i=0;i<6;i++) {
			
			for(int y=0;y<l/2;y++ ) {
				if(y==k) {
					System.out.print("*");
				}
				else {
				
				System.out.print("0");
				}
				
			}
			k--;
			for(int x=(l/2);x>0;x--) {
				if(x==j) {
					System.out.print("*");
					
				}
				else {
				System.out.print("0");
				}
				
				
				
			}
			j--;
			
			
			//System.out.print("*");
			
			
			
			System.out.println("");
			
		}
		

	}

}
