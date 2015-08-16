package ilentt.ilenlab.com.inheritance;

public class ShapeApp {
	
	Point A,B,C;
		
	public ShapeApp() {
		// default constructor
		A = new Point(1,5);
		B = new Point(2,8);
		C = new Point(6,8);
	}
	
	public void CircleMod() {
		
		Circle c = new Circle(A,B);
		System.out.println("Shape is: " + c.getShapeName());
		System.out.println("Named is: " + c.getName());
		System.out.println("Coordinates is A" + c.getPointA().toString() + ", B"+c.getPointB().toString());
		System.out.println("Perimeter is: " + c.getPerimeter());
		
		c = new Circle("My circle", A, C);
		
		System.out.println("\nShape is: " + c.getShapeName());
		System.out.println("Named is: " + c.getName());
		System.out.println("Coordinates is A" + c.getPointA().toString() + ", B"+c.getPointB().toString());
		System.out.println("Perimeter is: " + c.getPerimeter());
	}
	
	public void RectangleMod() {
		//Rectangle r = new Rectangle(25,42);
		Shape r = new Rectangle(25,42);
		System.out.println("\nShape is: " + r.getShapeName());
		System.out.println("Size is: " + r.toString());
		System.out.println("Perimeter is: " + r.getPerimeter());
		
		r = new Rectangle("My Rectangle",42,59);
		System.out.println("\nShape is: " + r.getShapeName());
		System.out.println("Size is: " + r.toString());
		System.out.println("Perimeter is: " + r.getPerimeter());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeApp app = new ShapeApp();
		app.CircleMod();
		app.RectangleMod();
	}

}
