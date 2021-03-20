
public class BinaryGap {

	public static void getGap(int N) {
		
		String s=Integer.toBinaryString(N);
		 //int n=Integer.parseInt(s);
	        System.out.println(s);
	        int l=s.length();
	        int count=0;
	        int temp=0;
	        int result=0;
	        //100100001
	        //100001001
	        //1000000
	        for(int i=0;i<l;i++) {
	        	if(s.charAt(i)=='1') {
	        		count=count+1;
	        	}
	        	if(count==1&&s.charAt(i)=='0') {
	        		temp=temp+1;
	        	}
	        	if(result<temp&&count>1) {
	        		result=temp;
	        	}
	        	if(count>1) {
	        		count=1;
	        		temp=0;
	        	}
	        	
	        }
	        System.out.println(result);
	}	
	        
	     
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=19;
		 getGap(N);  
		
		
		
	}

}
