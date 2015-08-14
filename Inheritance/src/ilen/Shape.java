package ilen;

public abstract class Shape {
	// name for example Square, Circle, Rectangle, 
	private String strName;
	
	// default constructor
	public Shape() {
		this.strName = this.getShapeName();
	}
	
	public Shape(String name) {
		this.strName = name;
	}
	
	public String getName() {
		return strName;
	}
	
	public void setName(String name) {
		this.strName = name;
	}
	
	// abstract class return name of shape
	public abstract String getShapeName();
	
	// abstract class return perimeter
	public abstract double getPerimeter();
}
