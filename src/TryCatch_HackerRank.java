import java.util.Scanner;
class MyCalculator {
    /*
    * Create the method long power(int, int) here.
    */
    long power(int n,int p) throws Exception{
        if((n<0&&p<0) ||n<0||p<0){
            throw new Exception("n or p should not be negative.");
        }
        else if((n==0&&p==0) ||n==0||p==0){
            throw new Exception("n or p should not be zero.");
        }
        else {
            for(int i=1;i<p;i++){
                System.out.println(n=n*n);
            }
        }
        return n;
    }
    
}

public class TryCatch_HackerRank {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}