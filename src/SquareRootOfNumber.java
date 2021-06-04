
public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=37;
		int i=2;
		sqrroot(x);
	}

	private static void sqrroot(double x) {
		// TODO Auto-generated method stub
		boolean flag=true;
		double i=1;
		while(flag) {
			if(i*i==x) {
				System.out.println(i);
				flag=false;
				
			}
			else if(i*i>x) {
				double res=square(x,i-1,i);
				System.out.println(res);
				flag=false;
			}
			i++;
		}
		
	}

	private static double square(double x, double i, double j) {
		// TODO Auto-generated method stub
		double mid=(i+j)/2;
		double mul=mid*mid;
		if(mul==x||Math.abs(mul-x)<0.00001) {
			return mid;
		}else if(mul<x) {
			return square(x, mid, j);
		}
		else
			return square(x, i, mid);
		//return 0;
	}

}
