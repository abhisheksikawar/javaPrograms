import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerPredicateSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List al=new ArrayList();
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		
		al.forEach(a->{
			System.out.println(a);
			System.out.println(a+"ABCDEF");
		});
		
		Predicate pred=i->{
			int x=Integer.parseInt((String) i);
			return (x<18); };
		System.out.println(pred.test(al.get(3)));
		
		Supplier sup=()->{
			String s="abhishek";
			return s;
		};
		System.out.println(sup.get());
		
		
		
		
	}

}
