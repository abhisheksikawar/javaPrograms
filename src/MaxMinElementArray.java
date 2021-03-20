import java.util.Arrays;
import java.util.Collections;

public class MaxMinElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//********using inbuilt function********
		
		Integer arr[]= {2,4,6,8,9,10,14,16,20,22,25,29,34,43};

		int max=Collections.max(Arrays.asList(arr));
		int min =Collections.min(Arrays.asList(arr));
		System.out.println("max= "+max+"  "+"min= "+min);
		
		
		

	}

}
