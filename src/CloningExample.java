class clone implements Cloneable{
	
	String s1;
	String s2;
	String s3;
	public clone(String s1, String s2, String s3) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	 protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		 
	 }
	@Override
	public String toString() {
		return "clone [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
	}
	 
	 
	
}
public class CloningExample {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		clone c=new clone("A","B","c");
		clone c2=null;
		
		c2=(clone)c.clone();
		
		c2.s1="change";
		
		System.out.println("c1"+ c);
		System.out.println("c2"+ c2);
		

	}

}
