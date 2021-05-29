import java.util.Scanner;

public class PrimeNumber {
	static int temp=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
		
//		int i=2;
//		int flag=0;
//		while(i<=n/2) {
//			if(n%i==0) {
//				flag=1;
//			}
//			i++;
//		}
//		if(flag==0) {
//			System.out.println("prime");
//		}else {
//			System.out.println("Non prime");
//		}
		
		int ans=primeOrNot(n,2);
		if(ans==1)System.out.println("Not prime");
		else System.out.println("prime");

	}

	private static int primeOrNot(int n,int i) {
		// TODO Auto-generated method stub
		
		if(i<n&&n%i==0) {
			return 1;
		}
		if(i>n) {
			return 0;
		}
			
		return primeOrNot(n, i+1);
		
	}

}
