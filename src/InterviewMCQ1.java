
public class InterviewMCQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("strting");
		try {
			throw new RuntimeException("intensionally thrwing");
			
		}
		catch(Exception e) {
			System.out.println("in catch");
		}
	}

}
