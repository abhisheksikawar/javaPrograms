import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

class Job implements Comparable{
	private char jobId;
	private int deadline;
	private int profit;
	public Job(char jobId, int deadline, int profit) {
		super();
		this.jobId = jobId;
		this.deadline = deadline;
		this.profit = profit;
	}
	
	public char getJobId() {
		return jobId;
	}

	public void setJobId(char jobId) {
		this.jobId = jobId;
	}

	public int getDeadline() {
		return deadline;
	}

	public void setDeadline(int deadline) {
		this.deadline = deadline;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Job job=(Job)o;
		if(this.getProfit()>job.getProfit()) {
			return -1;
		}
		return 1;
	}
	
	
	
}
public class JobSequenceProblem {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Job> al=new ArrayList<Job>();
		al.add(new Job('a',2,100));
		al.add(new Job('b',1,19));
		al.add(new Job('c',2,27));
		al.add(new Job('d',1,25));
		al.add(new Job('e',3,15));
		
		int arr[]=maxProfit(al);
	}

	private static int[] maxProfit(ArrayList<Job> al) {
		// TODO Auto-generated method stub
		int l=al.size();
		int A[]=new int[l+1];
		Arrays.fill(A, 0);
		Collections.sort(al);
		Iterator<Job> it=al.iterator();
		while(it.hasNext()) {
			Job j=it.next();
			System.out.println(j.getProfit());
			
		}
		
		for(int i=0;i<l;i++) {
			//al.get(i).getDeadline();
			if(A[al.get(i).getDeadline()]==0) {
				A[al.get(i).getDeadline()]=al.get(i).getProfit();
			}
		}
		
		
		System.out.println(Arrays.toString(A));
		
		return A;
	}

}
