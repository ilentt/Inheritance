package ilentt.ilenlab.com.inheritance;

public class Circle extends Shape {
	
	private Point A;
	private Point B;
	
	public Circle(Point A, Point B) {
		super();
		this.A = A;
		this.B = B;
	}
	
	public Circle(String name, Point A, Point B) {
		super(name);
		this.A = A;
		this.B = B;
	}
	
	public void setPointA(Point A) {
		this.A = A;
	}
	
	public Point getPointA() {
		return A;
	}
	
	public void setPointB(Point B) {
		this.B = B;
	}
	
	public Point getPointB() {
		return B;
	}
	
	public double getR() {
		Point p = new Point();
		return p.getLine(this.A,this.B);
	}
	
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Circle";
	}
	
	public double getPerimeter() {
		return 2*getR()*Math.PI;
	}
}
