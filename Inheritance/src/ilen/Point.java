package ilen;


public class Point {
	private int x;
	private int y;
	private Point P;
	
	public Point () {
		// default constructor
		x = 0;
		y = 0;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setPoint(Point P) {
		this.P = P;
	}
	
	public Point getPoint() {
		return P;
	}
	
	public String toString() {
		return "("+x+","+y+")";
	}
	
	public double getLine(Point A, Point B) {
		return Math.sqrt(Math.pow((A.x - B.x),2) + Math.pow((A.y - B.y),2));
		//return Math.sqrt(Math.pow((A.getX() - B.getX()),2) + Math.pow((A.getY() - B.getY()),2));
	}
}
