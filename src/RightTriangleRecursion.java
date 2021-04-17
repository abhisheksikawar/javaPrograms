
public class RightTriangleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		createTriangle(n);

	}
	//*
	//**
	//***
	
	static void createTriangle(int n) {

		if(n==0) {
			return ;
			
		}else {
			createTriangle(n-1);
			int k=0;
			while(k<n) {
			System.out.print("*");
			k++;
			}
			System.out.println("");
			
		}
		
		
	}

}
