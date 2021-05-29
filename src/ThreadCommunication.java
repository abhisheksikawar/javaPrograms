class Chat{
	boolean flag=false;
	public synchronized void askQuestion(String s) throws InterruptedException {
		if(flag) {
			wait();
			Thread.sleep(1000);
		}
		System.out.println(s);
		flag=true;
		notify();
		
		
	}
	
	public synchronized void tellAnswer(String ans) throws InterruptedException {
		if(!flag) {
			wait();
			Thread.sleep(1000);
		}
		System.out.println(ans);
		flag=false;
		notify();
		
		
	}
}
class Thread1 implements Runnable {
	Chat c;
	String []s1= {"Hi","How are you?","i m good"};
	public Thread1(Chat c) {
		this.c=c;
		Thread t=new Thread(this,"thread1");
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<s1.length;i++) {
			try {
				c.askQuestion(s1[i]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
class Thread2 implements Runnable
{
	Chat c;
	String []s2= {"Hi","I am good.How are you?","cool"};
	public Thread2(Chat c) {
		this.c=c;
		Thread t=new Thread(this,"thread 2");
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<s2.length;i++) {
			try {
				c.tellAnswer(s2[i]);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
public class ThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		Chat chat=new Chat();
		Thread1 t1=new Thread1(chat);
		Thread2 t2=new Thread2(chat);
		

	}

}
