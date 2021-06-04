
//1 1 2 3 5 8 13
public class FibnociiSeriesuptoSumK {
	static int n1=0,n2=1,sum=0,ans=50;
	static void fib(int n) {
		if(n>0&&sum<ans) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			
			if(sum>ans) {
				return ;
			}
			System.out.println(sum);
			fib(n-1);
		}
			
		//return n;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fib(50);
	}

}
