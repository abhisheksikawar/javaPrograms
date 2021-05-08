import java.util.ArrayList;
import java.util.Comparator;

class Employee5{
	int id;
	String name;
	String department;
	Address1 addr;
	public Employee5(int id, String name, String department, Address1 addr1) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.addr = addr1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", addr=" + addr + "]";
	}
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
	public Address1 getAddr() {
		return addr;
	}
	public void setAddr(Address1 addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
}
class Address1{
	String street;
	String city;
	public Address1(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
public class SortUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee5> al=new ArrayList<>();
		Address1 addr1=new Address1("rambagh","agra");
		al.add(new Employee5(23,"ram","ece",addr1));
		al.add(new Employee5(23,"abhi","ece", new Address1("transymuna","aalwar")));
		al.add(new Employee5(23,"jay","ece", new Address1("transymuna","aaagra")));
		
		al.stream().sorted(Comparator
                .comparing(Employee5::getName)
).forEach(s->System.out.println(s));


	}

}
