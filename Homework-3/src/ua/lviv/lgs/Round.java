package ua.lviv.lgs;

public class Round {
	
	private double radius;
	private double diametr;
	private double roundArea;
	private double roundLength;
	
	public double getRoundArea () {
		roundArea = (diametr/2)*(diametr/2)*Math.PI;
		return(roundArea);
	}
	
	public double getRoundLength() {
		roundLength = 2*Math.PI*radius;
		return(roundLength);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius (double radius) {
		this.radius = radius;
	}
	
	public double getDiametr() {
		return diametr;
	}
	
	public void setDiametr (double diametr) {
		this.diametr = diametr;
	}

}
