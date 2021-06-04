class Circle{
	public Circle draw() {
		return new Circle();
	}
}
class Rectangle extends Circle{
	public Rectangle draw() {
		System.out.println("rectangle");
		return new Rectangle();
	}
}
public class MethodOverriding {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Rectangle();
		c.draw();

	}

}
