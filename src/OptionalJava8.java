import java.util.ArrayList;
import java.util.Optional;
class Employee1505{
	int id;
	String name;
	String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Employee1505(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	
}

public class OptionalJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1505> al=new ArrayList<>();
		al.add(new Employee1505(1, "ABC", "ECE"));
		al.add(new Employee1505(2, null, "ECE"));
		al.add(new Employee1505(3, null, "ECE"));
//		al.add(7);
//		al.add(9);
//		al.add(11);
		Optional<String> op=Optional.ofNullable(al.get(2).getName());
		System.out.println(op.isPresent());
		Optional<String> op1=Optional.of(al.get(0).getName());
		System.out.println(op1.get());
		

	}

}
