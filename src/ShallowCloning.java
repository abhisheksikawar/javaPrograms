class ShallowClone implements Cloneable{
	private String s1;
	private String s2;
	private String s3;
	private CloneReference cloneReference;
	public String getS1() {
		return s1;
	}
	public void setS1(String s1) {
		this.s1 = s1;
	}
	public String getS2() {
		return s2;
	}
	public void setS2(String s2) {
		this.s2 = s2;
	}
	public String getS3() {
		return s3;
	}
	public void setS3(String s3) {
		this.s3 = s3;
	}
	public CloneReference getCloneReference() {
		return cloneReference;
	}
	public void setCloneReference(CloneReference cloneReference) {
		this.cloneReference = cloneReference;
	}
	public ShallowClone(String s1, String s2, String s3, CloneReference cloneReference) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.cloneReference = cloneReference;
	}
	@Override
	public String toString() {
		return "ShallowClone [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", cloneReference=" + cloneReference + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}
	
}
class CloneReference{
	private String s4;
	private String s5;
	public String getS4() {
		return s4;
	}
	public void setS4(String s4) {
		this.s4 = s4;
	}
	public String getS5() {
		return s5;
	}
	public void setS5(String s5) {
		this.s5 = s5;
	}
	public CloneReference(String s4, String s5) {
		super();
		this.s4 = s4;
		this.s5 = s5;
	}
	@Override
	public String toString() {
		return "CloneReference [s4=" + s4 + ", s5=" + s5 + "]";
	}
	
	
	
	
}
public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneReference cr=new CloneReference("D", "E");
		ShallowClone sc1=new ShallowClone("A", "B", "C",cr);
		
		ShallowClone sc2=null;
		sc2=(ShallowClone)sc1.clone();
		System.out.println("s1"+sc1);
		System.out.println("s2"+sc2);
		
		sc2.getCloneReference().setS4("C2");;
		sc2.setS1("C3");
		
		System.out.println("s1"+sc1);
		System.out.println("s2"+sc2);
		System.out.println(sc1.getCloneReference());
		//System.out.println(sc1.getS1());
		
		
		

	}

}
