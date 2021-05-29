 class Fun1 implements Runnable {
	 String s;
	 Fun1(String s){
		 this.s=s;
	 }
	public void run() {
		System.out.println("I am running"+s+Thread.currentThread().getName());
	}
}

public class MultiThreadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fun1 f=new Fun1("fun");
		Thread t1=new Thread(f,"thread1");
		t1.start();
		Thread t2=new Thread(f,"thread2");
		t2.start();

	}

}
