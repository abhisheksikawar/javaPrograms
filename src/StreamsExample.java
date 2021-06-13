import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Food{
	int id;
	String name;
	int calories;
	public Food(int id, String name, int calories) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
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
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	
}
public class StreamsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//List<Integer> al=Arrays.asList(1,2,3,4);
		List<Food> al=new ArrayList<>();
		al.add(new Food(1,"apple",200));
		al.add(new Food(2,"mango",300));
		al.add(new Food(1,"grape",400));
		al.add(new Food(1,"strawberry",500));
		al.add(new Food(1,"lallu",600));
		
//		al.stream().filter(f->f.getCalories()>200).sorted(Comparator.comparingInt(Food :: getCalories).reversed()).forEach(s->System.out.println(s.getName()));
//		
		al.stream().filter(f->f.getCalories()>200).sorted((o1,o2)->{
			if(o1.getCalories()>o2.getCalories())
		return 1;
			else {
				return -1;
			}
		}).forEach(s->System.out.println(s.getName()));
		
		

	}

}
