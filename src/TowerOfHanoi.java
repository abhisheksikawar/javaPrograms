
public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hanoi(3,1,3,2);

	}
	
	public static void hanoi(int n,int fromRod,int toRod,int auxRod) {
		
		if(n==1) {
			System.out.println("moving disk 1 from rod "+fromRod+" to rod "+toRod);
			return;
			
		}
		hanoi(n-1,fromRod,auxRod,toRod);
		System.out.println("Moving disk "+n+ " from rod "+fromRod+" to rod "+toRod);
		hanoi(n-1,auxRod,toRod,fromRod);
		
	}

}
