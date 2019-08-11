package ua.lviv.lgs;

public class Rectangle {
	
	private double length;
	private double width;
	private double area;
	private double perimetr;
	
	Rectangle() {
		
	}
	
	Rectangle(double length, double width) {
		this.length = 15;
		this.width = 22;
	}
	
	public double getArea () {
		area = width*length;
		return(area);
	}
	
	public double getPerimetr() {
		perimetr = (width + length)*2;
		return(perimetr);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength (double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth (double width) {
		this.width = width;
	}
	
	
	//same
}
