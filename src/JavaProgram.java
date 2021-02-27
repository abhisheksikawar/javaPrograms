
public class JavaProgram {
	
	public static void main(String args[]) {
		System.out.println("Hello world");
		//reverse an array
		int arr[]= {10,20,30,40,50,10,20};
		int length=arr.length;
		int temp=0;
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++){
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
				
			}
			
		}
		
	}

}
