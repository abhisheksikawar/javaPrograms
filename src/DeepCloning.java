class DeepClone implements Cloneable{
	private String s1;
	private String s2;
	private String s3;
	private DeepCloneReference deepCloneReference;
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
	public DeepCloneReference getDeepCloneReference() {
		return deepCloneReference;
	}
	public void setDeepCloneReference(DeepCloneReference cloneReference) {
		this.deepCloneReference = deepCloneReference;
	}
	public DeepClone(String s1, String s2, String s3, DeepCloneReference deepCloneReference) {
		super();
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.deepCloneReference = deepCloneReference;
	}
	@Override
	public String toString() {
		return "ShallowClone [s1=" + s1 + ", s2=" + s2 + ", s3=" + s3 + ", cloneReference=" + deepCloneReference + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		DeepClone deepClone=(DeepClone)super.clone();
		deepClone.deepCloneReference=(DeepCloneReference)deepCloneReference.clone();
		return deepClone;
		
	}
	
}
class DeepCloneReference implements Cloneable{
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
	public DeepCloneReference(String s4, String s5) {
		super();
		this.s4 = s4;
		this.s5 = s5;
	}
	@Override
	public String toString() {
		return "DeepCloneReference [s4=" + s4 + ", s5=" + s5 + "]";
	}
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		DeepCloneReference cr=new DeepCloneReference("D", "E");
		DeepClone sc1=new DeepClone("A", "B", "C",cr);
		
		DeepClone sc2=null;
		sc2=(DeepClone)sc1.clone();
		System.out.println("s1"+sc1);
		System.out.println("s2"+sc2);
		
		sc2.getDeepCloneReference().setS4("C2");;
		sc2.setS1("C3");
		
		System.out.println("s1"+sc1);
		System.out.println("s2"+sc2);
		

	}

}
