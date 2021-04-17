class Aa{
	int data;
	boolean valueSet=false;

	public synchronized int getData() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		valueSet=false;
		notify();
		return data;
	}

	public synchronized void setData(int data) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("set : "+data);
		this.data = data;
		valueSet=true;
		notify();
	}
	
}
class Producer implements Runnable{

	Aa a;
	
	public Producer(Aa a) {
		this.a = a;
		Thread thread= new Thread(this,"Producer");
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(true) {
		a.setData(i++);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
}
class Consumer implements Runnable{
	
	Aa a;
	

	public Consumer(Aa a) {
		this.a = a;
		Thread thread= new Thread(this,"Consumer");
		thread.start();
	}


	@Override
	public void run() {
		while(true) {
		System.out.println("get : "+a.getData());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	
}

public class WaitNotifyMultithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a=new Aa();
		Producer p=new Producer(a);
		Consumer c=new Consumer(a);

	}

}
