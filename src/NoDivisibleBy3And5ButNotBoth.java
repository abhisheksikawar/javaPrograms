
public class NoDivisibleBy3And5ButNotBoth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =15;
		int x=3;
		int y=5;
		int i=1;
		int n=1;
		while(i<=15) {
			if(n%x==0&&n%y!=0) {
				System.out.println(n);
				i++;
			}else if(n%y==0&&n%x!=0) {
				System.out.println(n);
				i++;
			}
			n++;
		}
		

	}

}
