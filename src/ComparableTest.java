import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class OrderByAge implements Comparable<OrderByAge>{
	
	String name;
	int age;
	String address;
	
	public OrderByAge(String name, int age, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.address=address;
	}

	@Override
	public int compareTo(OrderByAge o) {
		// TODO Auto-generated method stub
		
		return this.age-o.age;
	}
	
	
}
public class ComparableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<OrderByAge> al=new ArrayList<OrderByAge>();
		OrderByAge oba1=new OrderByAge("sik",12,"assd");
		OrderByAge oba2=new OrderByAge("abhi",10,"assd");
		OrderByAge oba3=new OrderByAge("sikarwar",8,"assd");
		
		al.add(oba1);
		al.add(oba2);
		al.add(oba3);
		
		Collections.sort( al);
		for(OrderByAge o:al) {
			System.out.println(o.address+" "+o.age+" "+o.name);
		}
	}

}
