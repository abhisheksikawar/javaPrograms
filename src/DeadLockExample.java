
public class DeadLockExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String resource1="I am Resource 1";
		final String resource2="I am Resource 2";

		Thread t1=new Thread() {
			public void run() {
				
				synchronized(resource1) {
					System.out.println("Thread 1 resource 1 is blocking");
					
					try {
					Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					synchronized(resource2) {
						System.out.println("Thread 1 resource  2 is blocking");
						
					}
					
				}
				
				
				
			}
			
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 resource 2 is blocking");
					try {
						Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					synchronized(resource1) {
						System.out.println("Thread 2 resource 1 is blocking");

					}

				}

			}

			
		};
		t1.start();
		t2.start();
	}

}
