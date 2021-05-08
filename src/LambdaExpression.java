interface lambdaI{
	public int fun(int a,int b);
	//public void fun2();
}

public class LambdaExpression  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		lambdaI li=(int a,int b)->{
			System.out.println("asd");
			return a+b;
		};
		System.out.println(li.fun(10,20));
	}

}
