import java.util.ArrayList;
import java.util.Optional;

public class FindFirstFindAnyJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(5);
		Optional<Integer>op=al.stream().findFirst();
		
		if(op.isPresent()) {
			System.out.println(op.get());
		}
		
		Optional<Integer>op1=al.stream().filter(f->f>5).findFirst();
		if(op1.isPresent()) {
			System.out.println(op1.get());
		}
		
		Optional<Integer>op2=al.stream().findAny();
		if(op2.isPresent()) {
			System.out.println(op2.get());
		}
		Optional<Integer>op3=al.stream().filter(f->f>2).findAny();
		if(op3.isPresent()) {
			System.out.println(op3.get());
		}
	}

}
