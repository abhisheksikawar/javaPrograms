
public class TryCatchWithReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d=divide(10,2);
		System.out.println(d);

	}

	private static int divide(int i, int j) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			System.out.println(a/b);
			return a/b;
			
		}
		catch(Exception e) {
			System.out.println("exception");
			return 0;
		}
		finally {
			System.out.println("finally");
			return 1;
		}
	}

}
