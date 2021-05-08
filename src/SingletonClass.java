class TrySingleton{

	private TrySingleton() {

	}
	
	public void fun() {
		System.out.println("fun from TrySingleton");
	}
	
	public static TrySingleton trySingleton;
	
	public static TrySingleton getInstance() {
		
		if(trySingleton==null) {
			//double lock checking singleton class example
			synchronized (TrySingleton.class) {
				
				if(trySingleton==null) {
				
				trySingleton=new TrySingleton();
				}
				
			}
			
		}
		return trySingleton;
	}
	
	
	
}

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrySingleton ts=TrySingleton.getInstance();
		
		ts.fun();

	}

}
