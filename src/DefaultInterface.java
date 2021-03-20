interface interface1{
	void m1();
	void m2();
	default void d1() {
		System.out.println("i m default method one");
	}
	default void d2(){
		System.out.println("i m default d2");
		}
	static void s1() {
		System.out.println(" i m static s1");
	}
	
	static void s2() {
		System.out.println(" i m static s2");
	}

}
interface interface2{
	void m3();
	void m2();
	default void d2(){
		System.out.println("i m default d2");
		}
	static void s2() {
		System.out.println(" i m static s2");
	}

	
	
}
public class DefaultInterface implements interface1,interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultInterface di=new DefaultInterface();
		di.m1();
		di.m2();
		di.m3();
		di.d1();
		di.d2();
		interface1.s1();
		interface1.s2();
		interface2.s2();
		

	}
	
	public void m1() {
		System.out.println("implementation m1");
		
	}
	public void m3() {
		System.out.println("implementation m3");
		
	}
	public void d2() {
		interface1.super.d2();
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("implemetation m2");
		
	}

	

}
