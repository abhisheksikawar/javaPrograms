import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	String department;
	Address addr;
	public Employee(int id, String name, String department, Address addr) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", addr=" + addr + "]";
	}
	
	
	
	
}
class Address{
	String street;
	String city;
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
class sortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}
public class ComparatorEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> al=new ArrayList<>();
		Address addr1=new Address("rambagh","agra");
		al.add(new Employee(23,"ram","ece",addr1));
		al.add(new Employee(23,"abhi","ece", new Address("transymuna","aalwar")));
		al.add(new Employee(23,"jay","ece", new Address("transymuna","aaagra")));
		
		//Collections.sort(al, new sortByName());// long way of doing sorting
		Collections.sort(al,(Object o1, Object o2) ->{
				// TODO Auto-generated method stub
				Employee e1=(Employee)o1;
				Employee e2=(Employee)o2;
				
				
				return e1.addr.city.compareTo(e2.addr.city);
			}
			
		);
		al.forEach(c ->System.out.println(c));
		
	

	}

}
