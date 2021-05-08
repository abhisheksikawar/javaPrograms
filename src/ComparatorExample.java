import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Laptop1{
	private String name;
	private int ram;
	private Long price;
	
	
	@Override
	public String toString() {
		return "Laptop1 [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	public Laptop1(String name, int ram, Long price) {
		super();
		this.name = name;
		this.ram = ram;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

	
}
public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop1> al=new ArrayList<>();
		al.add(new Laptop1("dell",8,1000L));
		al.add(new Laptop1("apple",6,2000L));
		al.add(new Laptop1("acer",10,800L));
		al.add(new Laptop1("hp",12,1200L));
		
		Collections.sort(al,(Object o1, Object o2) ->{
				// TODO Auto-generated method stub
				Laptop1 l1=(Laptop1)o1;
				Laptop1 l2=(Laptop1)o2;
				if(l1.getPrice()>l2.getPrice()) {
					return 1;
				}
				return -1;
			}
			
		
				);
		
		
			
		al.forEach(c->System.out.println(c));


	}

}
