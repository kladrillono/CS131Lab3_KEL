
public class ListApp {

	public static void main(String[] args) {
		//test code for Strings
		ArrayList<String> stringList = new ArrayList<String>();
		
		stringList.addItem(new String("sunflower"));
		stringList.addItem(new String("daisy"));
		stringList.addItem(new String("rose"));
		stringList.addItem(new String("dandelion"));
		stringList.addItem(new String("peony"));
		stringList.addItem(new String("lotus"));
		stringList.addItem(new String("orchid"));
		
		System.out.println(stringList.getCurrentItem());
		
		System.out.println(stringList.addItem(new String("tulip")));
		
		stringList.addItem(new String("daffodil"));
		stringList.addItem(new String("lilac"));
		
		System.out.println(stringList.toString());
		
		System.out.println(stringList.addItem(new String("gardenia")));
		
		System.out.println(stringList.getCurrentItem());
		
		//test code for Squares
		ArrayList<Square> squareList = new ArrayList<Square>();
		
		squareList.addItem(new Square(3.5));
		squareList.addItem(new Square(4.0));
		squareList.addItem(new Square(5.0));
		squareList.addItem(new Square(6.5));
		squareList.addItem(new Square(7.5));
		squareList.addItem(new Square(8.0));
		squareList.addItem(new Square(9.5));
		squareList.addItem(new Square(10.0));
		//squareList.addItem(new Square(11.5));
		//squareList.addItem(new Square(12.0));
		
		System.out.println(squareList.addItem(new Square(13.5)));
		
		System.out.println(squareList.toString());
		
		//test code for Points
		ArrayList<PointThreeD> pointsList = new ArrayList<PointThreeD>();
		
		pointsList.addItem(new PointThreeD(1.0, 2.0, 3.0));
		pointsList.addItem(new PointThreeD(4.0, 5.0, 6.0));
		pointsList.addItem(new PointThreeD(7.0, 8.0, 9.0));
		pointsList.addItem(new PointThreeD(10.0, 11.0, 12.0));
		
		System.out.println(pointsList.addItem(new PointThreeD(13.0, 14.0, 15.0)));
		
		System.out.println(pointsList.toString());

	}// end main

}// end class
