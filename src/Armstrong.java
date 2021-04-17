
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153;
		int x=n;
		int rem=0;
		int sum=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			
		}
		if(sum==x) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}

	}

}
