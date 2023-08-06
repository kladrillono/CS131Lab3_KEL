
public class PointThreeD<T> {
	
	private double xPoint;
	private double yPoint;
	private double zPoint;
	
	public PointThreeD() {
		
		this.xPoint = 0;
		this.yPoint = 0;
		this.zPoint = 0;
		
	}// end empty-argument constructor
	
	public PointThreeD(double x, double y, double z) {
		
		this.xPoint = x;
		this.yPoint = y;
		this.zPoint = z;
		
	}// end preferred constructor
	
	public double getxPoint() {
		
		return xPoint;
		
	}// end getxPoint

	public void setxPoint(double xPoint) {
		
		this.xPoint = xPoint;
		
	}// end setxPoint

	public double getyPoint() {
		
		return yPoint;
		
	}// end getyPoint

	public void setyPoint(double yPoint) {
		
		this.yPoint = yPoint;
		
	}// end setyPoint

	public double getzPoint() {
		
		return zPoint;
		
	}// end getzPoint

	public void setzPoint(double zPoint) {
		
		this.zPoint = zPoint;
		
	}// end setzPoint

	@Override
	public String toString() {
		
		return "PointThreeD [X: " + xPoint + ", Y: " + yPoint + ", Z: " + zPoint + "]";
		
	}// end toString
	

}// end class
