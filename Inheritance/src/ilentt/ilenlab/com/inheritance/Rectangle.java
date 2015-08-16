package ilentt.ilenlab.com.inheritance;

public class Rectangle extends Shape {

	private int iWidth;
	private int iHeight;
	
	public Rectangle(int width, int height) {
		//call default constructor of the parent class
		super();
		
		this.iWidth = width;
		this.iHeight = height;
	}
	
	public Rectangle(String name, int width, int height) {
		super(name);
		
		this.iWidth = width;
		this.iHeight = height;
	}
	
	public void setWidth(int width) {
		this.iWidth = width;
	}
	
	public int getWidth() {
		return iWidth;
	}
	public void setHeight(int height) {
		this.iHeight = height;
	}
	
	public int getHeight() {
		return iHeight;
	}
	
	public String toString() {
		return "W:H("+iWidth+":"+iHeight+")";
	}
	
	// implement abstract class declare in the parent class
	public String getShapeName() {
		// TODO Auto-generated method stub
		return "Rectangle";
	}
	
	public double getPerimeter() {
		return (iWidth + iHeight)*2;
	}
}
