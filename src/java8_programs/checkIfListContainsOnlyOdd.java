package java8_programs;

import java.util.ArrayList;
import java.util.List;

public class checkIfListContainsOnlyOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al=new ArrayList<>(5);
		al.add(1);
		al.add(3);
		al.add(13);
		al.add(5);
		al.add(9);
		al.add(7);
		al.add(9);
		al.add(11);
		System.out.println(al.stream().anyMatch(p->p%2!=0));

	}

}
