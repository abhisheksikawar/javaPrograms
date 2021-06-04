import java.util.Scanner;

public class AllPrimeNumbersBetweenTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		int n2;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
		int ans=findPrime(i,2);
		if(ans==0) {
		System.out.println("prime="+i);
		}
		}
		

	}

	private static int findPrime(int n,int i) {
		// TODO Auto-generated method stub
		if(i<n&&n%i==0) {
			return 1;
		}
		if(i>n) {
			return 0;
		}
			
		return findPrime(n, i+1);
		
	}

}
