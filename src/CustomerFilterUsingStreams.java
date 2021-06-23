import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Customer{
	int id;
	String name;
	double money;
	public Customer(int id, String name, double money) {
		super();
		this.id = id;
		this.name = name;
		this.money = money;
	}
	
	
}
public class CustomerFilterUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Customer> cus=new ArrayList<>();
		cus.add(new Customer(1,"abhishek",2000));
		cus.add(new Customer(2,"abhi",1500));
		cus.add(new Customer(3,"someone",2000));
		cus.add(new Customer(4,"four",1000));
		cus.add(new Customer(5,"hero",500));
		
		List<String> nam=
				cus.stream().filter(c->c.money>1000).map(m->m.name).collect(Collectors.toList());
		
		nam.forEach(s->System.out.println(s));

	}

}
