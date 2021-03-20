
public class FibonacciSeries {
	// 1 1 2 3 5 8
	static void fib(int n) {
		int a=1;
		int b=1;
		int sum=0;
		int temp;
		int x=0;
		while(x<n) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			x++;
		}
		
	}
	static int a=1,b=1, sum=0;
	 static  void recursion(int n) {
		if(n>0) {
		sum=a+b;
		a=b;
		b=sum;
		System.out.println(sum);
		recursion(n-1);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);
		System.out.println(1);
		recursion(8);
		//fib(8

		
		

	}

}
