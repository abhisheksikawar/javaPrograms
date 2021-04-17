interface i1{
	void fun() ;
}
class A implements i1{
	void m1() {
		System.out.println("m1");
	}
	public void fun() {
		System.out.println("having fun");
	}
}
class B extends A{
	void m2() {
		System.out.println("m2");
	}
}
public class InterfaceUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();
		b.m2();
		b.fun();

	}

}
