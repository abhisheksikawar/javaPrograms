package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Interval{
	 int start;
	 int end;
public Interval(int start, int end) {
	super();
	this.start = start;
	this.end = end;
}
@Override
public String toString() {
	return "Interval [start=" + start + ", end=" + end + "]";
}

	 
}

public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interval i[]=new Interval[5];
		 i[0]=new Interval(1,3);
		i[1]=new Interval(2,5);
		i[2]=new Interval(6,8);
		i[3]=new Interval(9,13);
		i[4]=new Interval(13,15);
		System.out.println(i);
		
		

	}

}
