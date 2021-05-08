import java.util.Date;

public class CopyConstructor {
	int id;
	String name;
	Date  date;
	
	public CopyConstructor(int id,String name,Date date) {
		// TODO Auto-generated constructor stub
		this.date=date;
		this.id=id;
		this.name=name;
	}
	public CopyConstructor(CopyConstructor cc) {
		// TODO Auto-generated constructor stub
		this.id=cc.id;
		this.name=cc.name;
		this.date=cc.date;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstructor ccd=new CopyConstructor(1,"abhi",new Date());
		CopyConstructor cc1=new CopyConstructor(ccd);
		System.out.println(cc1.name);

	}

}
