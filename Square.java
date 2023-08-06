
public class Square<T> {
	
	private double side;
	
	
	public Square() {
		
		this.side = 0;
		
	}// end empty-argument constructor
	
	public Square(double s) {
		
		this.side = s;
		
	}// end preferred constructor
	
	public double getSide() {
		
		return side;
		
	}// end getSide

	public void setSide(double side) {
		
		this.side = side;
		
	}// end setSide

	public double getArea() {
		
		double result;
		result = side * side;
		
		return result;
		
	}// end getArea

	@Override
	public String toString() {
		
		return "Square [Side: " + side + ", Area: " + getArea() + "]";
		
	}// end toString

	
	
}// end class
