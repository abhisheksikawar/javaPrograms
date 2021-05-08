interface Anonymous{
	void fun();
	void fun(String s1);
}
public class AnonymousClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Anonymous an=new Anonymous() {

			@Override
			public void fun() {
				// TODO Auto-generated method stub
				System.out.println("inside fun");
				
			}

			@Override
			public void fun(String s1) {
				// TODO Auto-generated method stub
				System.out.println("parameter fun : "+s1);
			}
			
			
		};
		an.fun();
		an.fun("boom");

	}

}
