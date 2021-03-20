
public class Multithreading implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Multithreading mt=new Multithreading();
//		mt.start();
//		mt.run();
//		
		Driver dr=new Driver();
		//dr.start();
		
		Thread t=new Thread(new Multithreading());
		t.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("I m running");
	}
	public void start() {
		System.out.println("Im rinnng in start");
	}

}
class Driver implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("i m run");
		
	}

	public void start() {
		// TODO Auto-generated method stub
		System.out.println("i m start");
		Thread t=new Thread();
		t.start();
	}
	
}