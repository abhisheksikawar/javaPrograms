import java.util.ArrayList;
import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		Consumer<Integer> c= new Consumer() {
			
			@Override
			public void accept(Object t) {
				// TODO Auto-generated method stub
				
			}
		};
		al.forEach(c);
		//al.forEach(i->System.out.println(i));
	}

}
