import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Employee1305{
	int id;
	String name;
	Address1305 address;
	
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
	
	
	public Address1305 getAddress() {
		return address;
	}
	public void setAddress(Address1305 address) {
		this.address = address;
	}
	public Employee1305(int id, String name,Address1305 addr) {
		super();
		this.id = id;
		this.name = name;
		this.address=addr;
	}
	@Override
	public String toString() {
		return "Employee1305 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}
class Address1305{
	String street;
	String city;
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
	public Address1305(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address1305 [street=" + street + ", city=" + city + "]";
	}
	
}
public class CustomSortingUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee1305> al=new ArrayList<>();
		al.add(new Employee1305(1,"anbc",new Address1305("as", "BCD")));
		al.add(new Employee1305(1,"abc",new Address1305("as", "ABC")));
		al.add(new Employee1305(1,"bcd",new Address1305("as", "CDE")));
		
		al.stream().sorted(Comparator.comparing(Employee1305::getName)).forEach(s->System.out.println(s));
		
		al.stream().sorted((o1,o2)->{
			return (o1.getAddress().getCity().compareTo(o2.getAddress().getCity()));
			
			
		}).forEach(so->System.out.println(so));
	}

}
