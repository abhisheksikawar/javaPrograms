import java.util.Arrays;
import java.util.Scanner;

public class WhoIsSmarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		String [] c=n.split(" ");
		int x=Integer.parseInt(c[0].trim());
		int y=Integer.parseInt(c[1].trim());
		//System.out.println(x+y);
		int r=0;
		int newX=0;
		while(x>0) {
			r=x%10;
			newX=newX*10+r;
			x=x/10;
			
		}
		int newY=0;
		while(y>0) {
			r=y%10;
			newY=newY*10+r;
			y=y/10;
		}
		if(newY>newX) {
		System.out.println(newY);
		}else {
			System.out.println(newX);
		}
	}

}
