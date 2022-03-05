import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String a[]=s.split(" ");
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++) {
        	String temp=a[i];
        	list.add(Integer.parseInt(temp.trim()));
        	
        }
        int Q=sc.nextInt();
        int op1 = 0;
        int op2 = 0;
        int op3 = 0;
        for(int i=0;i<Q;i++) {
        	String opt=sc.next();
        	if(opt.equalsIgnoreCase("INSERT")) {
        		 op1=sc.nextInt();
        		 op2=sc.nextInt();
        		 list.add(op1, op2);
        	}else {
        		 op3=sc.nextInt();
        		 list.remove(op3);
        	}
        	
        	
        	
        	
        	
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<list.size();i++){
        	sb.append((list.get(i)).toString());
            sb.append(" ");
        } 
        System.out.println(sb);
       
        


	}

}
