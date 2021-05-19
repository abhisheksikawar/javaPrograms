import java.util.ArrayList;

class Employee1405{
	int id;
	String name;
	Double salary;
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
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Employee1405(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
public class FilterJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1405> al=new ArrayList<>();
		al.add(new Employee1405(1, "ABC", 100.00));
		al.add(new Employee1405(2, "BCD", 50.00));
		al.add(new Employee1405(3, "CDE", 150.00));
		
		al.stream().filter(f->f.getSalary()>=100).forEach(c->System.out.println(c.getName()));

	}

}
