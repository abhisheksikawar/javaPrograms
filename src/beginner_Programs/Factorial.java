package beginner_Programs;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact=5;
		int i=fact;
		int factorial=1;
		while(i>0) {
			factorial=factorial*i;
			i--;
		}
		System.out.println(factorial);

	}

}
