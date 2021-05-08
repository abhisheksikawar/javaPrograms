enum Singleton{
	INSTANCE;
	void fun() {
		System.out.println("from Singleton enum");
	}
	
}
public class SingletonUsingEnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=Singleton.INSTANCE;
		s.fun();
		
	}

}
