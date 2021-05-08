import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable{
	private String name;
	private int ram;
	private Long price;
	
	
	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
	public Laptop(String name, int ram, Long price) {
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
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Laptop lp=(Laptop) o;
		if((this.name.compareTo(lp.name))>1) {
			return 1;
		}
		else {
			return -1;
		}
		//return 0;
	}
	
}
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Laptop> al=new ArrayList<>();
		al.add(new Laptop("dell",8,1000L));
		al.add(new Laptop("apple",6,2000L));
		al.add(new Laptop("acer",10,800L));
		al.add(new Laptop("hp",12,1200L));
		
		Collections.sort(al);
		for(Laptop l:al) {
			System.out.println(l);
		}

	}

}
